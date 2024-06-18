package Day1Assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PositiveorNegative {

		public static void main(String[] args) throws NumberFormatException, IOException {
			// Taking the input from the user
			BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
			// Enter the number to check
			System.out.println("Enter the number:");
			int n = Integer.parseInt(r1.readLine());
			// Create a method to check the condition and callinfg here
			Positive(n);

		}

	//Here method definition and checking condition
		public static void Positive(int n) {
			if (n < 0 || n == 0) {
				System.out.println("Negative number");
			} else {
				System.out.println("Positive number");
			}

		}
	}




