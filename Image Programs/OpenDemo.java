
//the program set image on frame of inappropriate size

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class OpenDemo extends JFrame implements ActionListener
{
JLabel l1;
JButton b1;
JFileChooser jfc;


OpenDemo()
{
setSize(400,400);
setVisible(true);
setResizable(true);

l1=new JLabel();
b1=new JButton("OPEN");

setLayout(new FlowLayout());
add(b1);add(l1);

b1.addActionListener(this);

}//end constructor

public void actionPerformed(ActionEvent e)
{


  if(e.getSource()==b1)
         {
                jfc=new JFileChooser();
           jfc.showOpenDialog(this);
        
String path=jfc.getSelectedFile().toString();
l1.setIcon(new ImageIcon(path));
   
        }
  }//end of function

public static void main(String ar[])
{
OpenDemo od=new OpenDemo();
}
}//end class


