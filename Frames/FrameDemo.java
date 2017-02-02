 
import java.awt.*;
import java.awt.event.*;

class FrameDemo extends Frame
    {
      FrameDemo()
       {
         setSize(400,600);
          setVisible(true);
         setBackground(Color.RED);
         setTitle("AWT PROGRAMS FRAME");
       }

public static void main(String arg[])
   {
     FrameDemo fd=new FrameDemo();
    }
}