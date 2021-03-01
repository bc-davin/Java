/*
 * Class: CMSC203 
 * Instructor: Dr. Grinberg
 * Description: Build an application that will receive a guess and report if your guess is the random number that was generated.  
                Your application will narrow down the choices according to your previous guesses 
                and continue to prompt you to enter a guess until you guess correctly.  
 * Due: 03/1/2021
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: ___Davicheanin Meas_______
*/

import java.util.Scanner;

public class RandomNumberGuesser {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner keyboard = new Scanner(System.in);
		// variable
		int nextGuess, c = 0;
		// display the intro to the program
		System.out.println("Welcome to the Random Number Guesser Program");
		// Start the prompt for guessing
		do {
			// call methods resetCount to start count at hero
			RNG.resetCount();
			// generate random number
			int randNum = RNG.rand();
			// high guess
			int highGuess = 100;
			// low guess
			int lowGuess = 1;
			// Ask the user that the random number has been generated
			System.out.println("The Program has generated a random number." + " Now you must try to guess it.");
			do {
				// Ask the user to enter their guess
				System.out.println("Enter your guess: ");
				// User input the guess
				nextGuess = keyboard.nextInt();
				// check if the guess is equal to the number generated
				if (RNG.inputValidation(nextGuess, lowGuess, highGuess)) {
					if (nextGuess <= randNum && (nextGuess - randNum) < (randNum - lowGuess)) {
						lowGuess = nextGuess;
					}
					if (nextGuess >= randNum && (nextGuess - randNum) < (highGuess - randNum)) {
						highGuess = nextGuess;
					}
				}
			} while (nextGuess != randNum);
			// Display that the user guessed is correctly
			System.out.println("Congratulations, you have guessed correctly.");
			// Ask the user if they would like to try the generator again
			System.out.println("Would you like to try again? (1 for yes or 2 for no)");
			// Input the user's choice
			c = nextGuess = keyboard.nextInt();
			keyboard.nextLine();
		} while (c == 1);
		// if the user chooses no
		if (c == 2) {
			System.out.println("Thanks for playing....");
		}

	}
}