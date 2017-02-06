import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class RobotDemo extends JFrame 
{
JLabel l1,l2;
JTextField t1,t2;
JButton b1;
Robot robot;

RobotDemo()
{
setSize(400,400);
setVisible(true);

setResizable(true);
l1=new JLabel("USER NAME:");
l1.setBounds(15,20,100,30);
l2=new JLabel("PASSWORD:");
l2.setBounds(15,60,100,30);

b1=new JButton("Login");
b1.setBounds(120,100,100,30);

t1=new JTextField(20);
t1.setBounds(130,20,200,30);
t2=new JTextField(20);
t2.setBounds(130,60,200,30); 

setLayout(null);
add(l1);add(l2);add(t1);add(t2);
add(b1);

try
{
robot=new Robot();
robot.delay(5000);

Point p1=t1.getLocationOnScreen();
robot.move(p1.x,p1.y);
t1.setText("MOHAN");

robot.delay(5000);


Point p2=t2.getLocationOnScreen();
robot.move(p2.x,p2.y);

t2.setText("1234");

robot.delay(5000);

Point p3=b1.getLocationOnScreen();
robot.move(p3.x,p3.y);
robot.mousePress(InputEvent.BUTTON1_MASK);
robot.delay(5000);

if(t1.getText().equals("MOHAN") && t2.getText().equals("1234"))
{
this.setVisible(false);

}
}catch(Exception e){}

}//end construcotr


public static void main(String ar[])
{
RobotDemo rd=new RobotDemo();
}
}//end class



