import java.awt.*;
import java.awt.event.*;
 

class CheckDemo extends Frame implements ItemListener
{
  Label l1,l2;
TextField t1,t2;
 Checkbox c1;


CheckDemo()
{
setSize(600,600);
setVisible(true);
setBackground(Color.green);
setResizable(true);
setForeground(Color.blue);
setTitle("CUBE/SQUARE FINDER ");
l1=new Label("Enter value");
l2=new Label("Result");
t1=new TextField(10);
t2=new TextField(10);
 c1=new Checkbox("Check");
setLayout(new FlowLayout());
add(l1);add(t1);add(l2);add(t2);add(c1);

c1.addItemListener(this);

addWindowListener(new WindowAdapter()
{public void windowClosing(WindowEvent e)
{ 
System.exit(0);
}});



}
public void itemStateChanged(ItemEvent e)
{
if(e.getSource()==c1)
          {
             if(c1.getState()==true)
	{
	   int m=Integer.parseInt(t1.getText());
                    t2.setText(""+(m*m*m) );
                 } 
          }  

if(e.getSource()==c1)
          {
             if(c1.getState()==false)
	{
	   int m=Integer.parseInt(t1.getText());
                    t2.setText(""+(m*m) );
                 } 
          }
}//END OF FUNCTION


public static void main(String ar[])
 {
   CheckDemo cd=new CheckDemo();
}
}//END OF CLASS