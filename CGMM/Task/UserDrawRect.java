import java.awt.event.*;
import java.awt.*;

class UserDrawRect extends Frame implements ActionListener
 {
int flag,x1,x2,y1,y2;
TextField t1,t2,t3,t4;
Label l1,l2,l3,l4;
Button b1;



   UserDrawRect()
   {
  setSize(500,500);
  setVisible(true);
  
b1=new Button("OK");
t1=new TextField(5);

t2=new TextField(5);
t3=new TextField(5);
t4=new TextField(5);

l1=new Label("x1");
l2=new Label("y1");
l3=new Label("x2");
l4=new Label("y2");

setLayout(new FlowLayout());
add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);add(l4);add(t4);
add(b1);

  addWindowListener(new WindowAdapter()
    { 
  public void windowClosing(WindowEvent e)
    {
dispose();
    }});



b1.addActionListener(this);


}//end constructor



public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
 {
   flag=1;
  x1=Integer.parseInt(t1.getText());
  y1=Integer.parseInt(t2.getText());
  x2=Integer.parseInt(t3.getText());
  y2=Integer.parseInt(t4.getText());
repaint();
}
}//end function

public void paint(Graphics g)
{
if(flag==1)
{
g.drawLine(x1,y1,x2,y1);
g.drawLine(x2,y1,x2,y2);
g.drawLine(x2,y2,x1,y2);
g.drawLine(x1,y2,x1,y1);
}
}//end fucntion

public static void main(String ar[])
{
new UserDrawRect();
}
}//end main
