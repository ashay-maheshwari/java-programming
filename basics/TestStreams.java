import java.io.*;
class TestStreams {
	public static void main(String ar[]){
	System.out.println("a normal message");
	System.err.println("an error message");
	  	
	InputStreamReader obj = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(obj);
	System.out.println("Print InputstreamReader obj " + obj);
	System.out.println("Print Buffered Object obj " + br);

	} //end main
}//end class
	
