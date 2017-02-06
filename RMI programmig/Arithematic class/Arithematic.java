import java.rmi.*;
import java.net.*;
import java.rmi.Naming.*;
import java.rmi.server.*;

public interface Arithematic extends Remote
{
public void sub() throws RemoteException;
public void getdata() throws RemoteException;
public void division() throws RemoteException;
public void multi() throws RemoteException;

}