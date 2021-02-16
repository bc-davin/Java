import java.util.Scanner;

public class WifiDiagnosis {

	public static void main(String[] agrs) {
		// create object
		String answer;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
		System.out.println("First step: reboot your computer");

		do {
			Connectivity();
			answer = keyboard.nextLine();
		} while (!answer.equals("yes") && (!answer.equals("no")));
		if (answer.equals("yes")) {
			System.out.print("Rebooting your computer seemed to work");
			return;
		}
		System.out.println("Second step: reboot your router");

		do {
			Connectivity();
			answer = keyboard.nextLine();
		} while (!answer.equals("yes") && (!answer.equals("no")));
		if (answer.equals("yes")) {
			System.out.print("Rebooting your router seemed to work");
			return;
		}

		System.out.println(
				"Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
		do {
			Connectivity();
			answer = keyboard.nextLine();
		} while (!answer.equals("yes") && (!answer.equals("no")));
		if (answer.equals("yes")) {
			System.out.print(
					"Making sure the cables to your router are plugged in firmly and your router is getting power seemed to work");
			return;
		}

		System.out.println("Fourth step: move your computer closer to your router");
		do {
			Connectivity();
			answer = keyboard.nextLine();
		} while (!answer.equals("yes") && (!answer.equals("no")));
		if (answer.equals("yes")) {
			System.out.print("Move your computer closer to your router seemed to work");
			return;
		}

		System.out.println("Fifth step: contact your ISP");
		System.out.println("Make sure your ISP is hooked up to your router.");

	}

	public static void Connectivity() {

		System.out.println("Are you able to connect with the internet? (yes or no)");

	}

}
