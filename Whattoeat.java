package unit1;

import java.util.Scanner;

public class Whattoeat {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		String eventType;
		int partySize = 0;
		String serve = null;
		String prepare = null;
		String result = "Since you're hosting ";
		System.out.print("What type of event?");
		eventType = keyboard.nextLine();
		if (eventType.equals("casual")) {
			serve = "sandwiches";
		} else if (eventType.equals("semi-formal")) {
			serve = "fried chicken";
		} else if (eventType.equals("formal")) {
			serve = "chicken parmesan";
		}
		System.out.println("what is your party size?");
		partySize = keyboard.nextInt();
		if (partySize == 1) {
			prepare = "in the microwave";
		} else if (partySize <= 12) {
			prepare = "in your kitchen";
		} else if (partySize >= 13) {
			prepare = "by a caterer";
		}
		System.out.print(result + eventType + " event for " + partySize + " participants, you should serve " + serve
				+ " prepared " + prepare + ". ");
		keyboard.close();

	}

}
