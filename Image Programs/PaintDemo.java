import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class PaintDemo extends JFrame implements ActionListener
{
JFileChooser jfc;
JLabel l1;
JButton b1;
Image img;

PaintDemo()
{
setSize(400,400);
setVisible(true);


l1=new JLabel();
b1=new JButton("OPEN");

setLayout(new FlowLayout());
add(l1);add(b1);
b1.addActionListener(this);
}//end of construcor


public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
jfc=new JFileChooser();
jfc.showOpenDialog(this);


String path=jfc.getSelectedFile().toString();

img=Toolkit.getDefaultToolkit().getImage(path);
}
repaint();
}//end function

public void paint(Graphics g)
{
g.drawImage(img,100,100,500,500,this);
}//end function


public static void main(String ar[])
{
PaintDemo pd=new PaintDemo();
}
}//end of class
