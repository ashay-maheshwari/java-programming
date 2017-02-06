import java.awt.*;
import java.awt.event.*;


class DrawHut extends Frame
{
int i,j,k;

DrawHut()
{
  setSize(800,800);
  setVisible(true);
  
}//end constructor


public void paint(Graphics g)
   { 

//mountians   
for(i=0;i<100;i++)
{
     g.setColor(Color.green);
     g.drawLine(10,100,60,30);
     g.drawLine(60,30,110,100);
	 g.drawLine(110,100,160,30);
	 g.drawLine(160,30,210,100);
	 g.drawLine(210,100,260,30);
	 g.drawLine(260,30,310,100);
	 g.drawLine(310,100,360,30);
	 g.drawLine(360,30,410,100);
}//end loop
     g.drawLine(10,100,410,100);

	//draw sun
	
	//g.drawArc(180,40,0,180,20,20);
	
   //draw house
   g.setColor(Color.BLUE);
   for(i=0;i<5;i++)
   {
   g.drawLine(400+i,250+i,600+i,250+i);
   g.drawLine(600+i,250+i,600+i,350+i);
   g.drawLine(600+i,350+i,400+i,350+i);
   g.drawLine(400+i,350+i,400+i,250+i);
   g.drawLine(480+i,250+i,480+i,350+i);
   }//end loop
   int xm=(400+480)/2;
int k;  
  for(i=0;i<5;i++)
  {
   g.drawLine(400+i,250,xm+i,200);
   g.drawLine(xm+i,200,480+i,250);
   g.drawLine(xm,200+i,560,200+i);
   
   g.drawLine(560+i,200,600+i,250);
   }//end loop
   for(k=10;k<130;k=k+10)
  g.drawLine(xm+k,200,480+k,250);
  

//gate
    g.drawLine(420,280,460,280);
     g.drawLine(460,280,460,350);
	 g.drawLine(420,280,420,350);
      g.drawLine(420,280,430,300);
	  g.drawLine(430,300,430,350);
     g.drawLine(460,280,450,300);
     g.drawLine(450,300,450,350);
	 
	 
	 //road
	 g.setColor(Color.RED);
	 for(i=0;i<=10;i++)
	 {
	 g.drawLine(400+i,352,320+i,600);
	 g.drawLine(480+i,352,400+i,600);
	 }
	 
	 for(int i=0;i<250;i=i+5)
	 {
	   g.drawLine(400+i,350+i,480-i,350+i);
	   
	   
	   
	   }
	 
	 }//end paint 
   
   
   public static void main(String ar[])
   {
     new DrawHut();
   }
}//end class 
	 

        