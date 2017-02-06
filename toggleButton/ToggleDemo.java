import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class ToggleDemo extends JFrame implements ActionListener
{
JToggleButton b1;

ToggleDemo()
{
setSize(400,400);
setVisible(true);
b1=new JToggleButton("true/false");
setLayout(new FlowLayout());
add(b1);
b1.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
if(b1.isSelected()==true)
System.out.println("true");
if(b1.isSelected()==false)
System.out.println("false");
}
}//end function

public static void main(String a[])
{
ToggleDemo td=new ToggleDemo();
}
}//end of class