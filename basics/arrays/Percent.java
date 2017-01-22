import java.io.*;
import java.util.*;

class Percent {
	public static void main(String args[]){
		// accept data from Keyboard , create an object of Scanner class 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many subjects ?");
		int  n = sc.nextInt();


		//init array to store marks
		int [] marks = new int[n];
		
		//store elements into array 
		for(int i = 0; i < n ; i++)
			{
				System.out.println("enter marks :");
				marks[i] = sc.nextInt();
			}
		int tot = 0;
		for(int i=0;i<n; i++)
			{
				tot = tot + marks[i];
			}

		System.out.println("Total marks = " + tot);
		float percent = (float)tot/n;
		System.out.println("Percentage = " + percent);
	} //end main
}//end class
