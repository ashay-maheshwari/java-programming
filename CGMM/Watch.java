import java.awt.*;

class Watch extends Frame 
{
  Watch()
   { 
    setSize(500,500);
	setVisible(true);
	
   }//end constructor

  public void paint(Graphics g)
   {
   g.drawArc(10,20,150,50,25,-130);
g.fillArc(10,80,150,50,25,-130);
  
   }//end paint
  
public static void main(String ar[])
  {
 new Watch();
}//end main
}//end class 
   
  