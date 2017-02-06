import java.io.*;
import java.util.*;


class FileDemo
{




public static void main(String ar[])
 {


     File f1=new File("C:/Program Files/Java/COPYRIGHT"); 
       System.out.println("FIleName\t"+f1.getName());
	 System.out.println("FilePath\t"+f1.getPath());
 System.out.println("AbsolutePath\t"+f1.getAbsolutePath());
 System.out.println("Parent\t"+f1.getParent());
 System.out.println(f1.exists()?"yes it do":"no it dose not");
 System.out.println(f1.canWrite()?"yes":"no");
  System.out.println(f1.canRead()?"yes read":"no read");


 }
}//end class
      