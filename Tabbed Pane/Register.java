import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

import java.sql.*;

class Register extends JFrame implements ActionListener
{
Statement st=null;
Connection con=null;
ResultSet rs=null;

JLabel l1,l2,l3,l4,l5;
JTextField t1,t2,t3;
JPasswordField p1;
JButton b1,b2;

Register()
{
setSize(500,500);
setVisible(true);
setResizable(true);

l1=new JLabel("REGISTRATION MODULE");
l1.setBounds(10,10,200,40);

l2=new JLabel("NAME:");
l2.setBounds(25,60,100,30);

t1=new JTextField(20);
t1.setBounds(120,60,200,30);

l3=new JLabel("PASSWORD");
l3.setBounds(25,100,100,30);

p1=new JPasswordField(20);
p1.setBounds(120,100,200,30);

l4=new JLabel("ADDRESS");
l4.setBounds(25,100,100,30);

t2=new JTextField(20);
t2.setBounds(120,100,200,30);


l5=new JLabel("EMAIL");
l5.setBounds(25,140,100,30);

t3=new JTextField(20);
t3.setBounds(120,140,200,30);


b1=new JButton("REGISTER");
b1.setBounds(130,180,100,30);

b2=new JButton("CLEAR");
b2.setBounds(250,180,100,30);

b1.addActionListener(this);
b2.addActionListener(this);
}//end construcor

public void  connect()
{
Statement st;
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("Jdbc:Odbc:connect","","");
st=con.createStatement();
}//end connect

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
try
{
connect();
String name=t1.getText();
String password=p1.getText();
String add=t2.getText();
String email=t3.getText();

st.executeUpdate("insert into Employee values('"+name+"','"+password+"','"+add+"','"+email+"')");
System.out.println("1 row update");
}catch(Exception ee){}
}//end of if



}//end of function

public static void main(String ar[])
{
Register r=new Register();
}
}//end of class