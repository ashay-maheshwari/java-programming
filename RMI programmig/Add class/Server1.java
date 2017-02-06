import java.rmi.*;
import java.rmi.Naming.*;
import java.net.*;
import java.rmi.server.*;

class Server1
{
Server1()
  {
System.out.println("hello server");
    try{
            Connect c=new AddConnect();
             Naming.rebind("rmi://localhost/calc",c);   
       }catch(Exception e){}
  }//end constructor
  


public static void main(String ar[])
{
new Server1();
}
}//end class
