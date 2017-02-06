import java.awt.*;


class DrawHutThread extends Frame implements Runnable
{
Thread th;
 int xm=(650+750)/2;
  DrawHutThread()
    {
	  setSize(1000,700);
	  setVisible(true);
      this.setBackground(Color.black);	 
	 th=new Thread(this,"Demo");
	  th.start();
	  repaint();
	 }

	 public void paint(Graphics g)
	  {
	  
	
	  //hut  bigger rectangle
	  for(int i=0;i<6;i++)
	  {
	  g.setColor(Color.red);
	  g.drawLine(650+i,350+i,950+i,350+i);
	  g.drawLine(950+i,350+i,950+i,450+i);
	  g.drawLine(950+i,450+i,650+i,450+i);
	  g.drawLine(650+i,450+i,650+i,350+i);
	  
	  
	  //hut smaller rectangle
	  g.drawLine(750+i,350+i,750+i,450+i);
	  
	  //hut traingle and top
	 
	  g.drawLine(650+i,350+i,xm+i,275+i);
      g.drawLine(900+i,275+i,950+i,350+i);	 
	  g.drawLine(xm+i,275+i,900+i,275+i);
	}
	  for(int i=0;i<=190;i=i+10)
	  {
	  g.drawLine(xm+i,275,750+i,350);
      }     
	 
	 
     //window
	 for(int i=0;i<6;i++)
	 {
	 g.drawLine(800+i,370+i,850+i,370+i);
	 g.drawLine(850+i,370+i,850+i,420+i);
	 g.drawLine(850+i,420+i,800+i,420+i);
	 g.drawLine(800+i,420+i,800+i,370+i);
        
	   }      
	 xm=(806+850)/2;
	   int ym=(376+420)/2;
	 g.drawLine(xm,370,xm,420);
     g.drawLine(800,ym,850,ym);	 
      
	 
	 //circle in hut
	 for(int i=0;i<=5;i++)
	 {
     g.setColor(Color.orange);
	 g.drawArc(695+i,310+i,10+i,10+i,0,360);
	 }
	 
	 //circle on hut
	 for(int i=0;i<200;i=i+10)
     {
      g.setColor(Color.green);	 
     g.drawArc(700+i,260,15,15,0,360);	 
	 }
	
    //gate
	for(int i=0;i<6;i++)
	{
	g.setColor(Color.blue);
	g.drawLine(650+i,350,670+i,380);
	g.drawLine(745+i,350,725+i,380);
	g.drawLine(670+i,380,670+i,450);
	g.drawLine(725+i,380,725+i,450);
	g.drawLine(670,375+i,725,375+i);

	}
	
    //grid gate
	
	for(int i=0;i<80;i=i+5)
	{
	 g.drawLine(670,380+i,725,380+i);
	}
	for(int i=0;i<55;i=i+3)
	{
	g.drawLine(670+i,380,670+i,450);
	}
    //cloud box
	for(int i=0;i<60;i++)
    g.drawLine(10,29+i,1000,29+i);
    
	 
	//clouds
	for(int i=0;i<900;i=i+80)
	{
	for(int j=0;j<15;j=j+2)
	{
	g.setColor(Color.cyan);
	g.drawArc(10+i,30,80+j,80+j,0,180);
	}
	}
	
	//grass
	for(int i=0;i<350;i+=5)
	{
	for(int j=0;j<100;j=j+20)
	{
	
	g.setColor(Color.green);
	g.drawArc(600+i,500+j,20,20,270,100);
	
	g.drawArc(600+i,520+j,20,20,270,100);
	g.drawArc(600+i,540+j,20,20,270,100);
	}
	}
	
	//boundry
	for(int i=0;i<350;i=i+15)
	{
	g.setColor(Color.orange);
	g.drawArc(600+i,480,15,15,0,180);
	g.drawArc(600+i,660,15,15,0,180);
	}
	
	//basketball court
	for(int i=0;i<=5;i++)
	{
	g.drawLine(300+i,500+i,580+i,500+i);
	g.drawLine(575+i,500+i,575+i,650+i);
	g.drawLine(575+i,650+i,300+i,650+i);
	g.drawLine(300+i,650+i,300+i,500+i);
	
	}
	
	//middle circle
    xm=(305+585)/2;
	ym=(505+655)/2;
	
	g.drawLine(xm,500,xm,650);
	g.drawArc(405,540,80,80,0,360);
	g.setColor(Color.red);
	g.fillArc(405,540,80,80,0,360);
	
	
	//man
	g.setColor(Color.orange);
	g.drawArc(80,400,60,80,0,360);
	g.drawLine(60,510,160,510);
	g.drawLine(160,510,160,600);
	g.drawLine(160,600,60,600);
	g.drawLine(60,600,60,510);
	
	//neck
	
	g.drawLine(80,480,140,480);
	g.drawLine(80,480,80,510);
	g.drawLine(140,480,140,510);
	
	//eyes
	g.drawArc(100,415,5,5,0,360);
	g.drawArc(115,415,5,5,0,360);
	g.drawArc(110,435,10,10,270,200);
	 //legs
	 for(int i=0;i<20;i++)
	  {
	  g.drawLine(65+i,600,65+i,650);
	  }
	
	  for(int i=0;i<20;i++)
	  {
	  g.drawLine(135+i,600,135+i,650);
	  }
	  
	 //birds
  for(int i=0;i<350;i=i+85)
  {
  g.setColor(Color.green);
  g.drawLine(610-i,150,625-i,135);
  g.drawLine(625-i,135,640-i,150);
     g.drawArc(600-i,150,60,20,0,180);	 
	 g.drawLine(600-i,160,620-i,180);
 g.drawLine(620-i,180,660-i,160);	 
 g.drawArc(590-i,150,15,15,0,360);
 g.drawLine(625-i,170,635-i,180);
  g.drawLine(640-i,170,650-i,180);
  
	}  
	 
   
  
	

	 
	}//end paint 
	 
	 
	 
	 
  
	 public void run()
    {  
	  try
	     {
		 
		 }catch(Exception e){}
    }
	
	
	
	
	
	
	
	
public static void main(String ar[])
 {
   new DrawHutThread();
 }
}//end main	