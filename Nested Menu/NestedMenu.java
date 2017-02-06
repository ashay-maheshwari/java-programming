import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class NestedMenu extends JFrame implements ActionListener
{
JMenuBar mb;
JMenu m1;
JMenuItem mi1,mi2;

NestedMenu()
{
setSize(200,200);
setVisible(true);

mb=new JMenuBar();
m1=new JMenu("OPTIONS");
mi1=new JMenuItem("menu1");
mi2=new JMenuItem("menu2");

m1.add(mi2);
m1.add(mi2.add(mi1));
mb.add(m1);
setJMenuBar(mb);
mi1.addActionListener(this);
mi2.addActionListener(this);

}

public void actionPerformed(ActionEvent e){}


public static void main(String ar[])
{
NestedMenu ns=new NestedMenu();
}
} 


 