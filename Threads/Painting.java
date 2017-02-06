import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Painting extends JFrame implements ActionListener
{
JLabel l1;
JButton b1;
Image i1,i2;

Painting()
{
i1=new Image("ashay.jpg");


setSize(400,400);
setVisible(true);

l1=new JLabel();
b1=new JButton("CLICK");

setLayout(new FlowLayout());
add(l1);add(b1);

}//end constructor

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{


}
repaint();
}

public void paint(Graphics g)
{
g.drawImage(i1,100,100,500,300,this);
}

public static void main(String ar[])
{
Painting p=new Painting();
}
}

