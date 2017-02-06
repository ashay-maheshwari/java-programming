import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




class Demo extends JFrame implements ActionListener
{
JButton b1,b2,b3;
JLabel l1;

Demo()
{
setSize(300,300);
setVisible(true);

b1=new JButton("1");
b2=new JButton("2");
l1=new JLabel();

setLayout(new FlowLayout());
add(l1);add(b1);add(b2);

b1.addActionListener(this);
b2.addActionListener(this);
}//END OF FUNCTION

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
l1.setText("1");
}

if(e.getSource()==b2)
{
l1.setText("2");
}

}

public static void main(String ar[])
{
Demo d=new Demo();
}
}//END OF CLASS