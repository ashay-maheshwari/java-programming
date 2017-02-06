import java.awt.event.*;
import java.awt.*;

class UserDrawKK extends Frame implements ActionListener
 {
int flag,x1,x2,y1,y2,s=100,xm,ym;
TextField t1,t2,t3,t4;
Label l1,l2,l3,l4;
Button b1;



   UserDrawKK()
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
  xm=(x1+x2)/2;
  ym=(y1+y2)/2;

if(x1==x2)
{
flag=1;
}
if(x1!=x2)
System.out.println("Please enter same value for x1 and x2:");

repaint();
}
}//end function

public void paint(Graphics g)
{
if(flag==1 && x1==x2)
{
for(int i=0;i<=150;i=i+150)
{
g.drawLine(x1+i,y1,x1+i,y2);
g.drawLine(xm+i,ym,x1+s+i,y1);
g.drawLine(xm+i,ym,x1+s+i,y2);
}
}



}//end fucntion

public static void main(String ar[])
{
new UserDrawKK();
}
}//end main
