package Day3Assignments;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		int row=3;
		int column=4;
	    int Array1[][]=new int[row][column];
	    int num=1;	    
	    for(int M=0;M<row;M++) {
	    	for(int N=0;N<column;N++) {
	    	Array1[M][N]=num++;	
	    		
	    	}
	    }
	    for (int M = 0; M < row; M++) {
            for (int N = 0; N< column; N++) {
                System.out.print(Array1[M][N] + "\t");
            }
            System.out.println();
        }
	    
	}

}

