import java.awt.*;
import java.applet.Applet;
import java.util.*;
/*<APPLET CODE="DigitalClock.class" Height="500" WIDTH="500"></APPLET>*/

public class DigitalClock extends Applet
  {
  Font theFont=new Font("Timesroman",Font.BOLD,24);
  Date theDate;
  
  public void start() 
    {
	  while(true)
	   {
	     theDate=new Date();
		 repaint();
		 
		 try
		   {
		    Thread.sleep(1000);
		   }catch(Exception e){}
		}//end while
      }//end start

   public void paint(Graphics g)
     {
	   g.setFont(theFont);
	   g.drawString(theDate.toString(),10,50);
	 }//end paint
	 
}//end class	 
	 
	   

	  