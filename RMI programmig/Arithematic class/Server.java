import java.rmi.*;
import java.net.*;
import java.rmi.Naming.*;
import java.rmi.server.*;

class Sever
{
Server()
{
try{
Arithematic a=new AddArithematic();
Naming.rebind("rmi://localhost/ari",a);
}catch(Exception e){}
}//end constructor

public static void main(String ar[])
{
new Server();
}
}//end class
