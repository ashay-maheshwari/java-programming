import java.io.*;
import java.util.Scanner;


class Transpose {
	public static void main(String ar[]) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter rows and columns ? :");
	int rows = sc.nextInt();
	int cols = sc.nextInt();

	//create an array with given size
 	int arr[][] = new int[rows][cols];

	//get values for matrix 
   	for(int i = 0; i < rows; i++)
	for(int j = 0; j < cols ; j++)
	arr[i][j] = sc.nextInt();

	System.out.println("Transpose of matrix is :");
	
	for(int i=0;i<cols;i++)
		{
		for (int j=0; j<rows; j++)
			{
				System.out.println(arr[j][i]+ "  ");
			}
		}
	} //end main
}//end class
