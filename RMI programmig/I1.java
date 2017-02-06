import java.rmi.Naming.*;
import java.net.*;
import java.rmi.*;

public interface I1 extends Remote
{

public int add(int a,int b) throws RemoteException;
public int sub(int a,int b) throws RemoteException;
}//end interface 
