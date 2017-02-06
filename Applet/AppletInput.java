import java.applet.*;
import java.awt.*;
import java.awt.event.*;


/*<applet code="AppletOutput" height="500" width="500" name="a1">*/
/*<applet code="AppletInput" height="200" width="200" name="a2">*/

public class AppletInput extends Applet implements ActionListener
 {
   Button show;

   public void init()
{
  show=new Button("SHOW");
  
   setLayout(null);
show.setBounds(10,50,50,100);
add(show);

show.addActionListener(this);

}//end init function

public void actionPerformed(ActionEvent e)
{
AppletOutput ao=(AppletOutput)getAppletContext().getApplet("a1");
String s=ao.t1.getText();
String s1=ao.t2.getText();
String c;

if(e.getSource()==show)
{
c=s+s1;
ao.t3.setText(c);
}
}//end actionperformed()
}//end class