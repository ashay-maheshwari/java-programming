import java.applet.*;
import java.awt.*;

public class AppletOutput extends Applet
 {
   TextField t1,t2,t3;
  Label l1,l2,l3;
  public void init()   
{
  t1=new TextField(25);
  t2=new TextField(25);
  t3=new TextField(50);

  l1=new Label("First Name:");
  l2=new Label("Last  Name:");
  l3=new Label("Full  Name:");

   add(l1);add(t1);
   add(l2);add(t2);
   add(l3);add(t3);
}//end function

}//end class