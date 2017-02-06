import java.rmi.*;
import java.rmi.Naming.*;
import java.rmi.server.*;

import java.net.*;


class Server
{
Server()
{
try
{
System.out.println("Server satrted:");
I1 i=new AddConnect();
Naming.rebind("rmi://localhost/calc",i);
}catch(Exception e){}
}//end constructor

public static void main(String ar[])
{
new Server();
}
}//end class
