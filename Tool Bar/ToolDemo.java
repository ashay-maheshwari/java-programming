import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class ToolDemo extends JFrame 
implements ActionListener
{
JToolBar
  tb;
JButton b1,b2,b3,b4,b5;

ToolDemo()
{
setSize(400,400);
setVisible(true);

tb=new JToolBar("HELLO");
b1=new JButton("",new ImageIcon("a.png"));
b2=new JButton("",new ImageIcon("b.png"));
b3=new JButton("",new ImageIcon("c.png"));
b4=new JButton("",new ImageIcon("d.png"));
b5=new JButton("",new ImageIcon("e.png"));

tb.add(b1);tb.add(b2);tb.add(b3);tb.add(b4);tb.add(b5);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);

setLayout(new BorderLayout());
add(tb,BorderLayout.NORTH);

}


public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
System.out.println("Clicked b1");

if(e.getSource()==b2)
System.out.println("Clicked b2");

if(e.getSource()==b3)
System.out.println("Clicked b3");

if(e.getSource()==b3)
System.out.println("Clicked b3");

if(e.getSource()==b4)
System.out.println("Clicked b4");

if(e.getSource()==b5)
System.out.println("Clicked b5");
}

public static void main(String ar[])
{
ToolDemo td=new ToolDemo();
}
}