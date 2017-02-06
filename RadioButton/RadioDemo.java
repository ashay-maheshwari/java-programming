import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class RadioDemo extends JFrame
{
JRadioButton r1,r2;
RadioDemo()
{
setSize(400,400);
setVisible(true);

r1=new JRadioButton("Radio1");
r2=new JRadioButton("Radio2");

setLayout(new FlowLayout());
add(r1);add(r2);
}

public static void main(String ar[])
{
RadioDemo rd =new RadioDemo();
}
}

