import java.rmi.Naming.*;
import java.net.*;
import java.rmi.*;
import java.rmi.server.*;


public class AddConnect extends UnicastRemoteObject implements I1
{
AddConnect() throws RemoteException{}

public int add(int a,int b) throws RemoteException
{
 return(a+b);
}  

public int sub(int a,int b) throws RemoteException
{
 return(a-b);
}
}//end class