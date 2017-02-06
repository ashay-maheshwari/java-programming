import javax.swing.*;
import java.awt.event .*;
import java.awt.*;


class OpenDemo extends JFrame implements ActionListener
{
JFileChooser jfc;
JMenuBar mb;
JMenu m1;
JMenuItem  mi1,mi2,mi3,mi4;
PrintJob pjb;

OpenDemo()
{
setSize(400,400);
setVisible(true);
setResizable(true);

mb=new JMenuBar();
m1=new JMenu("OPTIONS");

mi1=new JMenuItem("OPEN");
mi2=new JMenuItem("PRINT");
mi3=new JMenuItem("SAVE");
mi4=new JMenuItem("COLOR");

m1.add(mi1);m1.add(mi2);m1.add(mi3);m1.add(mi4);
mb.add(m1);
setJMenuBar(mb);
mi1.addActionListener(this);
mi2.addActionListener(this);
mi3.addActionListener(this);
mi4.addActionListener(this);
}//end constructor

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==mi1)
{
jfc=new JFileChooser();
jfc.showOpenDialog(this);
}
if(e.getSource()==mi3)
{
jfc=new JFileChooser();
jfc.showSaveDialog(this);
} 

if(e.getSource()==mi4)
{
Color c=this.getBackground();
c=JColorChooser.showDialog(this,"",c);
setBackground(c);
}

if(e.getSource()==mi2)
{
pjb=getToolkit().getPrintJob(this,"",null);
if(pjb!=null)
{
Graphics pg=pjb.getGraphics();
if(pg!=null)
{
paint(pg);
pg.dispose();
}
}
pjb.end();
}
}//end of function

public static void main(String ar[])
{
OpenDemo od=new OpenDemo();
}
}//end class



