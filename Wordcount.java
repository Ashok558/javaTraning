package javaprac;


import java.util.Scanner;


public class Wordcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String[] lines = new String [3];
		
		  for (int i=0;i<3; i++) {
			  System.out.println("Enter the line"+(i+1)+":");
			  lines [i] = sc.nextLine();
			  
		  }
		  
		  for ( int i=0;i<lines.length; i++) {
			  String line = lines[i];
			  int numberofwords = line.split("\\s+").length;
			  System.out.println("Line"+(i+1)+" has :"+numberofwords+" words.");
	
			  
		  }
		  sc.close();

	}
	// Method to count the number of words in a given line
    private static int countWords(String line) {
        if (line == null || line.isEmpty()) {
            return 0;
        }
 
        // Split the line by spaces to count the words
        String[] words = line.trim().split("\\s+");
        return words.length;
    }

}
