import java.util.Scanner;
import java.io.*;

class Ex3 {
	public static void main(String ar[]){
		System.out.print("enter id name sal: ");
		Scanner sc = new Scanner(System.in);
		
		int id = sc.nextInt();
		String name = sc.next();
		float sal = sc.nextFloat();
	
	
		System.out.println("Id = " + id);
		System.out.println("Name = " + name);
		System.out.println("Sal= " + sal);
	}//end main
}//end class 
