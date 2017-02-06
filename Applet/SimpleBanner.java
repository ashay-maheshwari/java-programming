import java.awt.*;
import java.applet.*;
/*
<applet code="Simple Banner" width=500,height=200>
</applet>
*/

public class SimpleBanner extends Applet implements Runnable
{
String msg="A simple moving banner";
Thread t=null;
int state;
boolean stopFlag;
//setclor and initialize thread

public void init()
{
setBackground(Color.cyan);
setForeground(Color.red);
}


public void start()
{
t=new Thread(this);
stopflag=false;
t.start();
}

public void run()
{
char ch;
for(;;)
{
try{
repaint();
Thread.sleep(250);
ch=msg.charAt(0);
msg=msg.substring(1,msg,length

