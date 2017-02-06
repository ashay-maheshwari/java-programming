import java.rmi.*;
import java.rmi.Naming.*;
import java.rmi.server.*;
import java.net.*;

class Client1
{
Client1()
   {
System.out.println("hello Client");
      try{
          
         Connect c1=(Connect)Naming.lookup("rmi://localhost/calc");
            System.out.println(c1.add(45,5));
            System.out.println(c1.sub(45,5));

         }catch(Exception e){} 
   }//end constructor


public static void main(String ar[])
{
new Client1();
}
}//end class