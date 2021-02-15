import java.util.Scanner;
/*
 * MovieDriver.java 
 * movie.java 
 * @author Davin
 *
*/
public class MovieDriver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); // Scanner Object
		char choice;
		do {
			Movie movie = new Movie(); // movie Object
			
			System.out.println("Enter the name of a movie: ");
			String movieTitle = keyboard.nextLine();
			movie.setTitle(movieTitle);
			
			System.out.println("Enter the rating of the movie: ");
			String movieRating = keyboard.nextLine();
			movie.setRating(movieRating);
			
			System.out.println("Enter the number of tickets sold for this movie: ");
			int soldTickets = keyboard.nextInt();
			movie.setSoldTickets(soldTickets);
			
			System.out.println(movie.toString());
			
			System.out.println("Do you want to enter another movie? (y or n)");
			choice = keyboard.next().toLowerCase().charAt(0);
			keyboard.nextLine();
		} while (choice != 'n');
		System.out.println("Goodbye");
		
		keyboard.close();
	}

}
