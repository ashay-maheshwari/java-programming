import java.rmi.*;
import java.net.*;
import java.rmi.Naming.*;
import java.rmi.server.*;

class AddConnect extends UnicastRemoteObject implements Connect
{

AddConnect() throws RemoteException{};

public int add(int a,int b) throws RemoteException
{
return(a+b);
}

public int sub(int a,int b)throws RemoteException
{
return(a-b);
}

}//end class  