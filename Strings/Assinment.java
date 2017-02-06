import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class Assinment extends JFrame 
{

JTextArea a1;
JTextField t1;
String val="";
ScrollBar v,h;
Assinment()
{
setSize(500,600);
setVisible(true);

a1=new JTextArea(val,15,50,Scrollbars.BOTH);
a1.setBounds(100,100,400,400);
t1=new JTextField(20);
t1.setBounds(100,520,100,30);
add(a1);add(t1);
setLayout(null);
}



public static void main(String ar[])
{
Assinment a=new Assinment();
}
}