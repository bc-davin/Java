
public class SavingsAccount extends BankAccount
{
/*
 * 1. A) It should contain an instance variable called rate that represents the annual interest rate. Set it equal to 2.5%.  
 * 
 */
private double rate=2.5;

/*
 *1. B)It should also have an instance variable called savingsNumber, initialized to 0. In this bank, you have one account number, 
 *but can have several savings accounts with that same number. Each individual savings account is identified by the number following a dash. 
 *For example, 100001-0 is the first savings account you open, 100001-1 would be another savings account that is still part of your same account. 
 *This is so that you can keep some funds separate from the others, like a Christmas club account. 
 */
private int savingsNumber=0;
/*
 * 1. C) An instance variable called accountNumber that will hide the accountNumber from the superclass, should also be in this class.
 */

private String accountNumber=" ";

/*
 * 2. Write a constructor that takes a name and an initial balance as parameters and calls the constructor for the superclass. 
 * It should initialize accountNumber to be the current value in the superclass accountNumber (the hidden instance variable) 
 * concatenated with a hyphen and then the savingsNumber.
 * 
 */
public SavingsAccount(String name,double amount)
{
	super(name, amount);
	setAccountNumber(getAccountNumber()+"-" + savingsNumber);
	
}
/*
 * 3.Write a method called postInterest that has no parameters and returns no value. 
 * This method will calculate one month's worth of interest on the balance and deposit it into the account.
 */
public void postInterest()
{
	rate = (rate/100)*12;
	setBalance((getBalance()*rate)+getBalance());
}
/*
 * 4. Write a method that overrides the getAccountNumber method in the superclass
 * 
 */

@Override
public String getAccountNumber() 
{
	savingsNumber+=1;
	accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	return accountNumber;
}

/*
 * 5. Write a copy constructor that creates another savings account for the same person. 
 * It should take the original savings account and an initial balance as parameters. 
 * It should call the copy constructor of the superclass, assign the savingsNumber to be one more than the savingsNumber of the original savings account. 
 * It should assign the accountNumber to be the accountNumber of the superclass concatenated with the hypen and the savingsNumber of the new account.
 */
	public SavingsAccount(SavingsAccount s, double balance){
		super(s,balance);
		savingsNumber +=1;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}





}
