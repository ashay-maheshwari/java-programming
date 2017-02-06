import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class ButtonArray extends JFrame 
{
ButtonArray()
{
setSize(500,500);
setVisible(true);
setLayout(new GridLayout(3,3));
int b=0;
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
add(new JButton("Button "+b));
++b;
}}

}
public static void main(String ar[])
{
ButtonArray bd=new ButtonArray();
}}