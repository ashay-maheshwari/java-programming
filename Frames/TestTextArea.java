import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class TestTextArea extends JFrame 
{
TextArea a;

TestTextArea()
{
setSize(500,500);
setVisible(true);

a=new TextArea(5,50);
add(a);
}

public static void main(String ar[])
{
TestTextArea as=new TestTextArea();
}
}//end of class
