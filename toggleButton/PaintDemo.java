import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class PaintDemo extends JFrame implements ActionListener
{
Image img;
JFileChooser jfc;
JButton b1;

JLabel l1;

PaintDemo()
{
setSize(400,400);
setVisible(true);

b1=new JButton(" OPEN");
l1=new JLabel();

setLayout(new FlowLayout());
add(b1);add(l1);

b1.addActionListener(this);
}//end construcor

public void actionPerformed(ActionEvent e)
{
jfc=new JFileChooser();
jfc.showOpenDialog(this);

String path=jfc.getSelectedFile().toString();
img=Toolkit.getDefaultToolkit().getImage(path);

repaint();
}


public void paint(Graphics g)
{
g.drawImage(img,100,100,500,500,this);
}


public static void main(String ar[])
{
PaintDemo pd=new PaintDemo();
}
}//end class
 