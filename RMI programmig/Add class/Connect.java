import java.rmi.*;
import java.net.*;
import java.util.*;


public interface Connect extends Remote
{

public int add(int a,int b) throws RemoteException;
public int sub(int a,int b) throws RemoteException; 

}//end interface