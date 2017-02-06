import java.awt.event.*;
import java.awt.*;

class UserDrawE extends Frame implements ActionListener
 {
int flag,x1,x2,y1,y2,s,xm,ym,i,gap=30,gap1=70,xm1,gap2=200;
TextField t1,t2,t3,t4;
Label l1,l2,l3,l4;
Button b1;



   UserDrawE()
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
if(flag==1 && x1<x2)
{
//draw E

g.drawLine(x1,y1,x1,y2);//line1
g.drawLine(x1,y1,x2,y1);//line2
ym=(y1+y2)/2;

g.drawLine(x1,ym,x2,ym);//line3
g.drawLine(x1,y2,x2,y2);//line4

//draw J
x1=x1+gap1;
x2=x2+gap1;
xm=(x1+x2)/2;

g.drawLine(x1,y1,x2,y1);//line1
g.drawLine(xm,y1,xm,y2);//line2
g.drawLine(xm,y2,x1,y2);//line3

//draw A
int s=30;//s=extented length
x1=x1+gap1+gap;

g.drawLine(x1,y1,x1-s,y2);//line8
g.drawLine(x1,y1,x1+s,y2);//line9

ym=(y1+y2)/2;
xm=(x1+x1-s)/2;
xm1=(x1+x1+s)/2;

g.drawLine(xm,ym,xm1,ym);//line10

//draw J


x1=x1+gap1;
g.drawLine(x1,y1,x1+gap1,y1);//line11
xm=(2*x1+gap1)/2;

g.drawLine(xm,y1,xm,y2);//line12
g.drawLine(xm,y2,x1,y2);//line13 
}
else
System.out.println("Coorinates are not correct:");


}//end fucntion

public static void main(String ar[])
{
new UserDrawE();
}
}//end main
