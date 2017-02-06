

import java.io.*;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class FrameAdd extends JFrame implements ActionListener
  {
   


JLabel l1;
Button b1,b2,b3,b4;
int i=0;
String s[];

FrameAdd()
{
s=new String[4];
s[0]="d.png";
s[1]="farah.jpg";
s[2]="Ashay.jpg";
s[3]="ashay.jpg";


setSize(500,500);
setVisible(true);

b1=new Button("first");
b2=new Button("prev");
b3=new Button("next");
b4=new Button("last");

l1=new JLabel();
l1.setIcon(new ImageIcon(s[0]));
setLayout(new FlowLayout());
add(l1);
add(b1);
add(b2);
add(b3);
add(b4);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
}
//end constructor

public void actionPerformed(ActionEvent ae)
{

if(ae.getSource()==b2)
{
if(i==0)
i=3;
else
i=i-1;
l1.setIcon(new ImageIcon(s[i]));
}

if(ae.getSource()==b3)
{
if(i==3)
i=0;
else
i=i+1;
l1.setIcon(new ImageIcon(s[i]));
}

if(ae.getSource()==b1){
i=0;
l1.setIcon(new ImageIcon(s[i]));
}

if(ae.getSource()==b4)
{
i=3;
l1.setIcon(new ImageIcon(s[i]));
}




}






}//end class

    






class one extends Thread
   {
        public void run()
{
      System.out.println("Thread one started:");

FrameAdd fd=new FrameAdd();

System.out.println("Thread one exited:");
}//end run 
}//end class  

class two extends Thread
   {
        public void run()
{
      System.out.println("Thread 2 started:");
//FrameAdd fd=new FrameAdd();
System.out.println("Thread 2 exited:");
}//end run 
}//end class  

class three extends Thread
   {
        public void run()
{
      System.out.println("Thread 3 started:");
FrameAdd fd=new FrameAdd();
System.out.println("Thread 3 exited:");
}//end run 
}//end class  


class four extends Thread
   {
        public void run()
{
      System.out.println("Thread one started:");
//FrameAdd fd=new FrameAdd();
System.out.println("Thread 4 exited:");
}//end run 
}//end class  


class five extends Thread
   {
        public void run()
{
      System.out.println("Thread 5 started:");
//FrameAdd fd=new FrameAdd();
System.out.println("Thread 5 exited:");
}//end run 
}//end class  
 


class PriorityDemo 
{
public static void main(String ar[])
 {
    one threadA=new one();
two threadB=new two();
three threadC=new three();
four threadD=new four();
five threadE=new five();

threadA.setPriority(10);

System.out.println("THREAD 1 starts:");
threadA.start();


System.out.println("THREAD 2 starts:");
threadB.start();

System.out.println("THREAD 3 starts:");
threadC.start();

System.out.println("THREAD 4 starts:");
threadD.start();

threadE.setPriority(9);
System.out.println("THREAD 5 starts:");
threadE.start();

System.out.println("Priorities of all thread are \n\n\n"+threadA.getPriority());
System.out.println(threadB.getPriority());
System.out.println(threadC.getPriority());
System.out.println(threadD.getPriority());
System.out.println(threadE.getPriority());




}//end main
}//end main class 