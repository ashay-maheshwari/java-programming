import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class DialogDemo extends JFrame implements ActionListener
{
JFileChooser jfc;
JMenuBar mb;
JMenu m1;
JMenuItem mi1,mi2,mi3,mi4;

PrintJob pjb;

DialogDemo()
{
setSize(500,500);
setVisible(true);
setResizable(true);

mb=new JMenuBar();
m1=new JMenu("Dialog");
mi1=new JMenuItem("Open");
mi2=new JMenuItem("save");
mi3=new JMenuItem("print");
mi4=new JMenuItem("color");


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
    
          if(e.getSource()==mi2);
             {
                  jfc=new JFileChooser();
                  jfc.showSaveDialog(this);
            }
             

if(e.getSource()==mi4)
{
Color c=this.getBackground();

c=JColorChooser.showDialog(this,"",c);System.out.println("in color");
setBackground(c);
}

if(e.getSource()==mi3)
{
pjb=getToolkit().getPrintJob(this,"",null);

if(pjb!=null)         
{
 Graphics pg=pjb.getGraphics();

if(pg!=null)
{
print(pg);
pg.dispose();
}
pjb.end();
}//end inner if
}//end if
}//end function


public static void main(String ar[])
{
DialogDemo d=new DialogDemo();
}
}//end class
