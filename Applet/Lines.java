import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="Lines" width=500,height=100>
</applet>
*/

public class Lines extends Applet
{
public void paint(Graphics g)
{
g.drawLine(0,0,100,100);
}


public static void main(String ar[])
{
Lines l=new Lines();
l.paint(Graphics g);
}
}