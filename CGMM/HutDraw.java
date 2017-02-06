import java.awt.event.*;
import java.awt.*;

class HutDraw extends Frame
{

int i,j,y;
    
	HutDraw()
           {
	setSize(800,800);
        setVisible(true);
        //setBackground(Color.cyan);
            }//end constructor

public void paint(Graphics g)
{

		
	//	g.setColor(Color.RED);
		g.drawLine(0,100,600,100);

		g.drawLine(0,100,100,0);
		g.drawLine(100,0,200,100);
		g.drawLine(200,100,300,0);
		g.drawLine(300,0,400,100);
		g.drawLine(400,100,500,0);
		g.drawLine(500,0,600,100);

		g.drawLine(300,400,600,400);
		g.drawLine(300,400,300,300);
		g.drawLine(600,400,600,300);
		g.drawLine(400,400,400,300);

		g.drawLine(350,200,300,300);
		g.drawLine(300,300,400,300);
		g.drawLine(400,300,600,300);


		j=600;
		for(i=550;i>=350;i=i-10,j=j-10)
		      g.drawLine(i,200,j,300);


		g.drawLine(350,200,550,200);
		g.drawLine(550,180,550,200);
		g.drawLine(530,180,530,200);



		g.drawArc(550,170,45,135,15,15);
		g.drawArc(550,180,45,135,15,15);
		g.drawArc(540,175,45,135,15,15);
		g.drawArc(540,165,45,135,15,15);

		g.drawLine(530,180,550,180);
		g.drawLine(330,400,330,350);
		g.drawLine(370,400,370,350);
		g.drawLine(330,350,370,350);
		g.drawLine(330,350,345,363);
		g.drawLine(370,350,355,363);
		g.drawLine(345,363,345,400);
		g.drawLine(355,363,355,400);
		g.drawLine(460,360,460,330);
		g.drawLine(460,330,520,330);
		g.drawLine(520,330,520,360);
		g.drawLine(520,360,460,360);


		//sun
	//g.setColor(Color.YELLOW);
          //      g.drawArc(400,50,0,360,50,50);
		g.drawArc(400,100,45,135,50,50);
		g.drawLine(400,50,400,15);
		g.drawLine(385,51,375,15);
		g.drawLine(370,58,350,5);
		g.drawLine(415,51,425,15);
		g.drawLine(430,58,450,5);
		//tree
		//setcolor(7);
		g.drawLine(20,350,30,290);
		g.drawLine(50,350,40,290);
		//setcolor(GREEN);
		g.drawLine(10,290,62,290);
		g.drawLine(35,260,15,290);
		g.drawLine(35,260,58,290);
		g.drawLine(35,240,15,294);
		g.drawLine(35,240,58,294);
		g.drawLine(35,220,15,296);
		g.drawLine(35,220,58,296);
		g.drawLine(35,190,10,290);
		g.drawLine(35,190,62,290);
		g.drawLine(35,160,10,290);
		g.drawLine(35,160,62,290);

		//birds
		//setcolor(9);

		g.drawArc(115,15,40,140,18,18);
		g.drawArc(128,15,40,140,18,18);


		g.drawArc(100,30,40,140,18,18);
		g.drawArc(113,30,40,140,18,18);

		g.drawArc(130,30,40,140,18,18);
		g.drawArc(143,30,40,140,18,18);

		g.drawArc(90,50,40,140,18,18);
		g.drawArc(103,50,40,140,18,18);

		g.drawArc(125,55,40,140,18,18);
		g.drawArc(138,55,40,140,18,18);



		//setcolor(15);
		g.drawLine(330,400,270,500);
		g.drawLine(370,400,320,500);
		//circle(349,264,15);
		g.drawLine(460,345,518,345);
		g.drawLine(489,330,489,360);
		//man
		//setcolor(8);
		//circle(240,290,10);
		//circle(235,288,1);
		//circle(244,288,1);
		g.drawArc(240,294,150,10,20,20);
		g.drawLine(250,300,250,330);
		g.drawLine(230,300,230,330);
		g.drawLine(250,300,230,300);
		g.drawLine(250,330,230,330);
		g.drawLine(235,331,235,350);
		g.drawLine(245,331,245,350);
		g.drawLine(235,350,230,350);
		g.drawLine(245,350,250,350);


		for(i=290;i<325;i++)
		 {
		 //setcolor(8);
		 g.drawLine(230,305,217,i);

		 //delay(100);
		 //setcolor(RED);
		 g.drawLine(230,305,217,i);

		 }
		 //setcolor(8);
		 g.drawLine(230,305,217,325);

		 for(i=290;i<325;i++)
		 {
		 //setcolor(8);
		 g.drawLine(250,305,263,i);

		// delay(100);
		 //setcolor(RED);
		 g.drawLine(250,305,263,i);

		 }
		 //setcolor(8);
		 g.drawLine(250,305,263,325);



	       //setcolor(15);
	       y=150;
	       g.drawLine(170,70,150,200);
	       for(i=170;i<230;i=i+2,y=y+2)
		   {
		    // delay(30);
		    g.drawLine(i,70,y,200);
		    }
	       g.drawLine(150,200,60,400);
	       y=60;
	       g.drawLine(230,70,210,200);
	       for(i=150;i<212;i=i+2,y=y+2)
		   {
		   // delay(30);
		    g.drawLine(i,200,y,400);
		    }
	       g.drawLine(210,200,123,400);
		y=0;
	       for(i=0;i<250;i=i+2,y=y+2)
		  g.drawLine(i,400,y,450);
		   //setcolor(9);
	  //DUCK
		//fillellipse(200,400,20,10);
		//circle(190,380,5);
		g.drawLine(195,380,190,390);
		g.drawLine(190,385,186,393);
		g.drawLine(185,380,183,385);

	  //DUCK
		//fillellipse(50,400,20,10);
		//circle(40,380,5);
		g.drawLine(45,380,40,390);
		g.drawLine(40,385,36,393);
		g.drawLine(35,380,32,385);
		for( i=300;i<400;i++)
		{

		 //setcolor(BLUE);
		// outtextxy(i,150,"... HAPPY HOLI ..." );
		// delay(40);
		 //setcolor(RED);
		// outtextxy(i,150,"... HAPPY HOLI ..." );

		 }

		 for( i=400;i>300;i--)
		{

		/* //setcolor(BLUE);
		 outtextxy(i,150,"... HAPPY HOLI ..." );
		 delay(40);
		 //setcolor(RED);
		 outtextxy(i,150,"... HAPPY HOLI ..." );*/

		 }
		/* //setcolor(BLUE);
		 outtextxy(310,150,"... HAPPY HOLI ..." );
		 //setcolor(BLUE);
		 outtextxy(440,440,"BY-:");
		 outtextxy(430,460,"( RANDHIR SINGH CHOUHAN )");*/

}//end paint


public static void main(String ar[])
{
new HutDraw();
}
}//end main class
