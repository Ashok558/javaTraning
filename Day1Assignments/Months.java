package Day1Assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Months {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Use buffered reader to take the input from the user
		BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
		// Enter the number
		System.out.println("Enter the number:");
		int choice = Integer.parseInt(r1.readLine());
		// if the given number is less then one or greater then 12 print invalid input
		if (choice < 1 || choice > 12) {
			System.out.println("Invalid input");
		} else {
			// Switch condition to print the months in word
			switch (choice) {
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("Feabruary");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
				break;
			case 7:
				System.out.println("July");
				break;
			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println("September");
				break;
			case 10:
				System.out.println("October");
				break;
			case 11:
				System.out.println("November");
				break;
			case 12:
				System.out.println("December");
				break;

			}

		}

	}

}

