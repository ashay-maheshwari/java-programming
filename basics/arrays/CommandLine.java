class CommandLine {
	public static void main(String ar[]){
	param = ar.length();

	System.out.println("Number of arguments : ", param);
	
	if(param != 2)
	{
	System.out.println("Please enter values: ");
	return;
	}	

	String s1 = ar[0];
	String s2 = ar[1];

	}//end main
}//end class
