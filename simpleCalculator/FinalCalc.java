import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;



class About extends JFrame implements ActionListener
{
JTextArea a1;
JButton b1;
About()
{
setSize(600,300);
setVisible(true);
setTitle("About");
setResizable(false);

a1=new JTextArea("1.Designed in JAVA SWING\n2.Uses the predefined functions of JAVA\n3.Designer-\nAASHAY MAHESHWARI\nIT 5th SEM\nCONTACT-8827893665\nemail=aaryaashay1848@gmail.com",5,50);
b1=new JButton("HOME",new ImageIcon("Home1.png"));
setLayout(new FlowLayout());
add(a1);add(b1);
b1.addActionListener(this);
}


public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
this.setVisible(false);
}
}//END OF CLASS


class Help extends JFrame implements ActionListener
{
JTextArea a1;
JButton b1;
Help()
{
setSize(600,400);
setVisible(true);
setTitle("Help");
setResizable(true);

a1=new JTextArea("The calculator designed is very easy to use.Just use your mouse click as if you are working on\n an original calculator.\nThe calculator also helps you to determine the current date and time.",5,50);
b1=new JButton("HOME",new ImageIcon("Home1.png"));
setLayout(new FlowLayout());
add(a1);add(b1);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
this.setVisible(false);
}
}//END OF CLASS







class FinalCalc extends JFrame implements ActionListener
{
JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bAdd,bSub,bMul,bDiv,bEqual,bClear;
JButton bDot,bAuto;
JTextField t1;
JLabel l1;
JMenuBar mb;
JMenu m1,m2,m3;
JMenuItem mi1,mi2,mi3,mi4,mi5;

int i=0;
Double AR[]=new Double[50];


Double no1,no2,result,replay;
int addc=0,multic=0,divc=0,subc=0;


//START OF CONSTRUCTOR

FinalCalc()
{
setSize(300,400);
setVisible(true);
setResizable(true);
setTitle("CALCULATOR");

mb=new JMenuBar();

m3=new JMenu("Date & Time");
m1=new JMenu("Options");
mi1=new JMenuItem("Help",new ImageIcon("eye.png"));
mi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,InputEvent.CTRL_MASK));

mi2=new JMenuItem("Exit",new ImageIcon("logoff.png"));
mi2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,InputEvent.CTRL_MASK));

m2=new JMenu("About");

mi3=new JMenuItem("Open",new ImageIcon("sd.png"));
mi3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,InputEvent.CTRL_MASK));

mi4=new JMenuItem("Date",new ImageIcon("views.png"));
mi4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,InputEvent.CTRL_MASK));

mi5=new JMenuItem("Time",new ImageIcon("snapshot.png"));
mi5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T,InputEvent.CTRL_MASK));



l1=new JLabel("SIMPLE CALCULATOR");
l1.setBounds(20,290,250,45);
l1.setForeground(Color.blue);



bAuto=new JButton("REPALY");
bAuto.setBounds(20,240,100,30);


b0=new JButton("0");
b0.setBounds(70,205,45,30);
b0.setForeground(Color.red);

b1=new JButton("1");
b1.setForeground(Color.red);
b1.setBounds(120,170,45,30);

b2=new JButton("2");
b2.setForeground(Color.red);
b2.setBounds(70,170,45,30);

b3=new JButton("3");
b3.setForeground(Color.red);
b3.setBounds(20,170,45,30);

b4=new JButton("4");
b4.setForeground(Color.red);
b4.setBounds(120,135,45,30);

b5=new JButton("5");
b5.setForeground(Color.red);
b5.setBounds(70,135,45,30);

b6=new JButton("6");
b6.setForeground(Color.red);
b6.setBounds(20,135,45,30);

b7=new JButton("7");
b7.setForeground(Color.red);
b7.setBounds(120,100,45,30);

b8=new JButton("8");
b8.setForeground(Color.red);
b8.setBounds(70,100,45,30);

b9=new JButton("9");
b9.setForeground(Color.red);
b9.setBounds(20,100,45,30);

bAdd=new JButton("+");
bAdd.setForeground(Color.blue);
bAdd.setBounds(170,100,45,30);

bSub=new JButton("-");
bSub.setForeground(Color.blue);
bSub.setBounds(170,135,45,30);

bMul=new JButton("*");
bMul.setForeground(Color.blue);
bMul.setBounds(170,170,45,30);

bDiv=new JButton("/");
bDiv.setForeground(Color.blue);
bDiv.setBounds(170,205,45,30);

bClear=new JButton("CLEAR");
bClear.setBounds(120,240,95,30);

bEqual=new JButton("=");
bEqual.setForeground(Color.red);
bEqual.setBounds(120,205,45,30);

bDot=new JButton(".");
bDot.setForeground(Color.red);
bDot.setBounds(20,205,45,30);



t1=new JTextField(10);
t1.setBounds(20,65,195,30);

//ADDING COMPONENTS
m1.add(mi1);m1.add(mi2);m2.add(mi3);
m3.add(mi4);m3.add(mi5);
mb.add(m1);mb.add(m2);mb.add(m3);
add(l1);
add(t1);
add(bAuto);
add(b9);add(b8);add(b7);add(bAdd);
add(b6);add(b5);add(b4);add(bSub);
add(b3);add(b2);add(b1);add(bMul);
add(b0);add(bDot);add(bEqual);add(bDiv);
add(bClear);add(bDot);
setJMenuBar(mb);

setLayout(null);



//REGISTRING THE BUTTONS

b0.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
bAdd.addActionListener(this);
bSub.addActionListener(this);
bDiv.addActionListener(this);
bMul.addActionListener(this);
bEqual.addActionListener(this);
bClear.addActionListener(this);

bAuto.addActionListener(this);
bDot.addActionListener(this);


mi1.addActionListener(this);
mi2.addActionListener(this);
m2.addActionListener(this);
mi3.addActionListener(this);
mi4.addActionListener(this);
mi5.addActionListener(this);

addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}});



}//END OF CONSTRUCTOR

public void actionPerformed(ActionEvent e)
{


if(e.getSource()==b0)
  {
    
     String s=t1.getText();
    t1.setText(s+"0");
}

if(e.getSource()==b1)
  {
     String s=t1.getText();
    t1.setText(s+"1");
}

if(e.getSource()==b2)
  {
     String s=t1.getText();
    t1.setText(s+"2");
}

if(e.getSource()==b3)
  {
     String s=t1.getText();
    t1.setText(s+"3");
}
if(e.getSource()==b4)
  {
     String s=t1.getText();
    t1.setText(s+"4");
}
if(e.getSource()==b5)
  {
     String s=t1.getText();
    t1.setText(s+"5");
}
if(e.getSource()==b6)
  {
     String s=t1.getText();
    t1.setText(s+"6");
}
if(e.getSource()==b7)
  {
     String s=t1.getText();
    t1.setText(s+"7");
}
if(e.getSource()==b8)
  {
     String s=t1.getText();
    t1.setText(s+"8");
}
if(e.getSource()==b9)
  {
     String s=t1.getText();
    t1.setText(s+"9");
}
if(e.getSource()==bAdd)
{
no1=Double.parseDouble(t1.getText());
addc=1;
t1.setText("");
}

if(e.getSource()==bSub)
{
no1=Double.parseDouble(t1.getText());
subc=1;
t1.setText("");
}
if(e.getSource()==bDiv)
{
no1=Double.parseDouble(t1.getText());
divc=1;
t1.setText("");
}


if(e.getSource()==bMul)
{
no1=Double.parseDouble(t1.getText());
multic=1;
t1.setText("");
}

if(e.getSource()==bEqual)
{
no2=Double.parseDouble(t1.getText());

     if(addc>0)
              {
                 result=no1+no2;
                  AR[i]=result;
                  i++;
                  t1.setText(""+result);
              }
      if(subc>0)
              {
                 result=no1-no2;
        AR[i]=result;
                  i++;
                  t1.setText(""+result);
              }
    if(multic>0)
              {
                 result=no1*no2;
        AR[i]=result;
                  i++;
                  t1.setText(""+result);
              }

   if(divc>0)
              {
                 result=no1/no2;
           AR[i]=result;
                  i++;
                  t1.setText(""+result);
              }



}
 if(e.getSource()==bAuto)
{
int m=0;


t1.setText(""+AR[0]);
t1.setText(""+AR[1]);


}  


if(e.getSource()==bClear)
  {
    t1.setText("");
}

if(e.getSource()==mi2)
{
System.exit(0);
}
if(e.getSource()==mi1)
{
Help h=new Help();
}
if(e.getSource()==mi3)
{
About a=new About();
}
if(e.getSource()==mi4)
{
Date date=new Date();
DateFormat df;
df=DateFormat.getDateInstance(DateFormat.FULL,Locale.US);

t1.setText(""+df.format(date));
}

if(e.getSource()==mi5)
{
GregorianCalendar gcalendar=new GregorianCalendar();

t1.setText(""+gcalendar.get(Calendar.HOUR)+":"+gcalendar.get(Calendar.MINUTE)+":"+gcalendar.get(Calendar.SECOND));
}


}//END OF FUNCTION


public static void main(String ar[])
{
FinalCalc fc=new FinalCalc();
}
}//eND OF CLASS