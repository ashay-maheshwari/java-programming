import java.awt.*;
import java.awt.event.*;


class Admin extends Frame
{
Label l1,l2;
Button b1;
TextField t1,t2;

Admin()
{
setSize(500,500);
setVisible(true);
setResizable(true);
setBackground(Color.yellow);

l1=new Label("USER NAME");
l2=new Label("PASSWORD");
b1=new Button("SUBMIT");

addWindowListener(new WindowAdapter()
{
public void windowClosing(WindoEvent e)
{
system.exit(0);
}});


