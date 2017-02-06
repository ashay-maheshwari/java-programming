import java.awt.event.*;
import java.awt.*;

class UserLineDraw extends Frame
 {
   UserLineDraw()
   {
  setSize(500,500);
  setVisible(true);
  
  addWindowListener(new WindowAdapter()
    { 
  public void windowClosing(WindowEvent e)
    {
dispose();
    }});
}//end constructor



public void paint(Graphics g)
{
g.drawLine(100,50,160,150);
}


public static void main(String ar[])
{
new UserLineDraw();
}
}//end main
