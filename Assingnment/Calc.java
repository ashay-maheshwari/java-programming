import java.awt.*;
import java.awt.event.*;

class Calc extends Frame 
{
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bAdd,bSub,bMulti,bDiv,bClear,bEqual;
TextField t1;


Calc()
{
setSize(300,500);
setVisible(true);
setResizable(false);
setBackground(Color.cyan);

b0=new Button("0");
b0.setBounds(30,30,20,20);

b1=new Button("1");
b1.setBounds(60,30,20,20);

b2=new Button("2");
b2.setBounds(90,30,20,20);

b3=new Button("3");
b3.setBounds(30,60,20,20);

b4=new Button("4");
b4.setBounds(60,60,20,20);

b5=new Button("5");
b5.setBounds(90,60,20,20);

b6=new Button("6");
b6.setBounds(30,90,20,20);

b7=new Button("7");
b7.setBounds(60,60,20,20);








t1=new TextField(50);
setLayout(new FlowLayout());
add(t1);

setLayout(null);
add(b0);add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);/*add(b8);add(b9);
add(b10);add(b11);add(b12);add(b13);add(b14);add(b15);add(b16);*/

/*b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b15.addActionListener(this);
b16.addActionListener(this);*/
}//END OF FUNCTION


public static void main(String ar[])
{
Calc c=new Calc();
}}//END OF CLASS
 
