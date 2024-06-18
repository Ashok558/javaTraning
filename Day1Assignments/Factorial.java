package Day1Assignments;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
			// By using scanner taking the inputs from the user
			Scanner sc = new Scanner(System.in);
			// Enter the number
			System.out.println("Enter the number:");
			int n = sc.nextInt();
			// Declare the fact =1 and i=1 because use are using do while loop
			int fact = 1;
			int i = 1;
			// if n<=0 print invalid input
			if (n <= 0) {
				System.out.println("Invalid input");

			}
			// Here do while loop
			do {

				fact = fact * i;
				i++;

			} while (i <= n);// condition checking
	//print the factorial		
			System.out.println(fact);

		}

	}




