import java.awt.*;
import java.applet.*;




public class HelloAgainApplet extends Applet{
Font f=new Font("TimesRoman",Font.BOLD,36);

public void main(Graphics g)
  {
  g.setFont(f);
  g.setColor(Color.red);
  System.out.println(":AppletStarted");
  g.drawString("HELLO AGIAN",5,50);
  }//end paint
}//end Applet class  