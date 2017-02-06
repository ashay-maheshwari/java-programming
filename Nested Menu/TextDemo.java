import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class TextDemo extends JFrame 
{
JTextArea a;
TextDemo()
{
setSize(300,300);
setVisible(true);
a=new JTextArea(5,5);
}
public static void main(String ar[])
{
TextDemo td=new TextDemo();
}
}