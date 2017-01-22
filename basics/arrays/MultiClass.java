//calling main() of a Class1 from another class : Class2

class Class1
{
	public static void main(String ar[]){
		for(String s:ar)
		System.out.println(s);
	}//end main

}//end Class1

class Class2
{
	public static void main(String args[]){
		String names[] = {"Gopi", "ashay"};
		
		//call main() of Class1
		Class1.main(names);
	}//end main
}//end Class2


