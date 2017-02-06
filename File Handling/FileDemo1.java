import java.io.*;
import java.util.*;


class FileDemo1
{




public static void main(String ar[])
 {


     File f1=new File("abc.jpg"); 
       System.out.println("FIleName\t"+f1.getName());
	System.out.println(f1.isFile()?"yes file":"no file");
System.out.println(f1.canRead()?"yes":"no");
System.out.println(f1.canWrite()?"yes write":"no Write"); 


}
}//end class
      