import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Painting extends JFrame implements ActionListener
{
JLabel l1;
JButton b1;
JFileChooser jfc;
Image i1,i2;

Painting()
{
setSize(400,400);
setVisible(true);

l1=new JLabel();
b1=new JButton("open");

setLayout(new FlowLayout());
add(l1);add(b1);
b1.addActionListener(this);
}//end constructor

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
jfc=new JFileChooser();
jfc.showOpenDialog(this);

String path=jfc.getSelectedFile().toString();
i1=Toolkit.getDefaultToolkit().getImage(path);
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

