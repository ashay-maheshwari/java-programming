import java.rmi.*;
import java.net.*;
import java.rmi.Naming.*;
import java.rmi.server.*;

class Client {
Client()
{
try
{
System.out.println("*********************MENU********************");


int ch;
while(true)
{
System.out.println("***********************MENU**************************");
System.out.print("\n\n1.Addition\t\t2.Substraction\n\n3.Division\t\t4.Multiplication");
System.out.println("\nEnter your choice:-");
Scanner sc=new Scanner(System.in);
ch=sc.nextInt();

Arithematic a1=(Arithematic)Naming.lookup("rmi://localhost/ari");
a1.getData();



if(ch==1)
a1.add();

if(ch==2)
a1.sub();

if(ch==3)
a1.division();

if(ch==4)
a1.multi();

}