
public class CheckingAccount extends BankAccount 
{

/*
 * 2. It should contain a static constant FEE that represents the cost of clearing one check. Set it equal to 15 cents.
 */
public static final double FEE=0.15; 
	
/*
 *3. Write a constructor that takes a name and an initial amount as parameters. It should call the constructor for the superclass. 
 * It should initialize accountNumber to be the current value in accountNumber concatenated with –10 (All checking accounts at 
 * this bank are identified by the extension –10). There can be only one checking account for each account number. 
 * Remember since accountNumber is a private member in BankAccount, it must be changed through a mutator method.
 */

public CheckingAccount(String name, double amount)
{
	super(name,amount);
	
	setAccountNumber(getAccountNumber()+"-10");
	
	
}

/*
 * Write a new instance method, withdraw, that overrides the withdraw method in the superclass. 
 * This method should take the amount to withdraw, add to it the fee for check clearing, and call the withdraw method from the superclass.
 *  Remember that to override the method, it must have the same method heading. 
 *  Notice that the withdraw method from the superclass returns true or false depending if it was able to complete the withdrawal or not. 
 * The method that overrides it must also return the same true or false that was returned from the call to the withdraw method from the superclass.
 */
@Override
public boolean withdraw(double amount)
{
	return super.withdraw(amount+FEE);
	
}


}
