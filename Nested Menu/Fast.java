import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Fast extends JFrame implements ActionListener
{
JTextArea a1;
JButton b1;
JTextField t1;

Fast()
{
setSize(600,600);
setVisible(true);

a1=new JTextArea(15,50);
a1.setBounds(50,50,300,200);


b1=new JButton("ok");
b1.setBounds(500,500,100,30);

t1=new JTextField(20);
t1.setBounds(200,500,100,30);

setLayout(null);
add(a1);add(b1);add(t1);
b1.addActionListener(this);
}


public void actionPerformed(ActionEvent e)
{
}

public static void main(String ar[])
{
Fast f=new Fast();
}
}//end class 
