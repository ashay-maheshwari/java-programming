import java.rmi.*;
import java.rmi.Naming.*;
import java.rmi.server.*;
import java.net.*;

class Client
{
Client()
{
try
{
System.out.println("Client ready:");
I1 i1=(I1)Naming.lookup("rmi://localhost/calc");
System.out.println(i1.add(5,4));
System.out.println(i1.sub(5,4));
}catch(Exception e){}
}//end constructor

public static void main(String ar[])
{
new Client();
}
}//end class

