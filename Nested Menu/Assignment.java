import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Assignment extends JFrame 
{
TextArea a;

Assignment()
{
setSize(500,500);
setVisible(true);

a=new TextArea(5,50);
add(a);
}

public static void main(String ar[])
{
Assignment as=new Assignment();
}
}//end of class