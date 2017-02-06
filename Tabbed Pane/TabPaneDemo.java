import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class TabPaneDemo extends JFrame 
{

JTabbedPane jtp;

TabPaneDemo()
{
setSize(500,500);
setVisible(true);

jtp=new JTabbedPane();

jtp.addTab("TAB 1",new ImageIcon("p.png"));
jtp.addTab("TAB 2",new ImageIcon("p.png"));
jtp.addTab("TAB 3",new ImageIcon("p.png"));
add(jtp);

}//end constructor 

public static void main(String ar[])
{
TabPaneDemo=new TabPaneDemo();
}
}//end class 
