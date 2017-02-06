import java.rmi.*;
import java.net.*;
import java.rmi.Naming.*;
import java.rmi.server.*;


public class AddArithematic extends UnicastRemoteObject implements Arithematic
{
AddArithematic() throws RemoteException{}
Scanner sc=new Scanner(System.in);
int a,b;

public void getData() throws RemoteException 
{
 a=sc.nextInt();
 b=sc.nextInt();
}//end function

public void sub() throws RemoteException
{
System.out.println("Substraction is==="+(a-b));
}//end function

public void add() throws RemoteException
{
System.out.println("ADDITION IS==="+(a+b)); 
}//end function

public void division() throws RemoteException
{
try{
System.out.println("DIVISION IS==="+(a/b)); 
}catch(Exception e){System.out.println(e);}
}//end function

public void multi() throws RemoteException
{
System.out.println("MULTIPLICATION is==="+(a*b));
}//end function

}//end class



















