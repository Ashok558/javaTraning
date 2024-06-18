package Day1Assignments;

import java.util.Scanner;

public class Pattern {
		public static void main(String[] args) {
			// Taking the input from user we are using Scanner
			Scanner sc = new Scanner(System.in);
			// Enter the number for no of rows
			System.out.println("Enter the no of rows:");
			int rows = sc.nextInt();
			// Here we are taking the for and while loop to print the pattern
			while (rows != 0) {

				for (int i = 0; i < rows; i++) {
					for (int j = 0; j <= i; j++) {
						System.out.print("*" + " ");

					}
					System.out.println(" ");
				}
				break;
			}
			// If we are taking rows as zero or less then zero it displays invalid input
			if (rows <= 0) {
				System.out.println("Invalid input");
			}

		}
	

}