import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Clator extends JFrame implements ActionListener
{
JButton b1,b2;
JTextField t1;

 Clator()
{
setSize(200,200);
setVisible(true);

t1=new JTextField(10);

b1=new JButton("0");
b2=new JButton("1");
setLayout(new FlowLayout());
add(t1);add(b1);add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
}//END OF FUNCTION

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
t1.setText(b1.getText());
if(e.getSource()==b2)
t1.setText(b1.getText()+b2.getText());
}
public static void main(String ar[])
{
Clator c=new Clator();
}
}