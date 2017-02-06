#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<stdlib.h>

	void main()
	{
	int i,j,y;
	int gdriver = DETECT, gmode;
	clrscr();
	initgraph(&gdriver, &gmode,"c:\\tc\\bgi");
		setbkcolor(4);
		setcolor(15);
		line(0,100,600,100);

		line(0,100,100,0);
		line(100,0,200,100);
		line(200,100,300,0);
		line(300,0,400,100);
		line(400,100,500,0);
		line(500,0,600,100);

		line(300,400,600,400);
		line(300,400,300,300);
		line(600,400,600,300);
		line(400,400,400,300);

		line(350,200,300,300);
		line(300,300,400,300);
		line(400,300,600,300);


		j=600;
		for(i=550;i>=350;i=i-10,j=j-10)
		      line(i,200,j,300);


		line(350,200,550,200);
		line(550,180,550,200);
		line(530,180,530,200);



		arc(550,170,45,135,5);
		arc(550,180,45,135,5);
		arc(540,175,45,135,5);
		arc(540,165,45,135,5);

		line(530,180,550,180);
		line(330,400,330,350);
		line(370,400,370,350);
		line(330,350,370,350);
		line(330,350,345,363);
		line(370,350,355,363);
		line(345,363,345,400);
		line(355,363,355,400);
		line(460,360,460,330);
		line(460,330,520,330);
		line(520,330,520,360);
		line(520,360,460,360);


		//sun
		setcolor(YELLOW);
		arc(400,100,45,135,50);
		line(400,50,400,5);
		line(385,51,375,15);
		line(370,58,350,5);
		line(415,51,425,15);
		line(430,58,450,5);
		//tree
		setcolor(7);
		line(20,350,30,290);
		line(50,350,40,290);
		setcolor(GREEN);
		line(10,290,62,290);
		line(35,260,15,290);
		line(35,260,58,290);
		line(35,240,15,294);
		line(35,240,58,294);
		line(35,220,15,296);
		line(35,220,58,296);
		line(35,190,10,290);
		line(35,190,62,290);
		line(35,160,10,290);
		line(35,160,62,290);

		//birds
		setcolor(9);

		arc(115,15,40,140,8);
		arc(128,15,40,140,8);


		arc(100,30,40,140,8);
		arc(113,30,40,140,8);

		arc(130,30,40,140,8);
		arc(143,30,40,140,8);

		arc(90,50,40,140,8);
		arc(103,50,40,140,8);

		arc(125,55,40,140,8);
		arc(138,55,40,140,8);



		setcolor(15);
		line(330,400,270,500);
		line(370,400,320,500);
		circle(349,264,15);
		line(460,345,518,345);
		line(489,330,489,360);
		//man
		setcolor(8);
		circle(240,290,10);
		circle(235,288,1);
		circle(244,288,1);
		arc(240,294,150,10,2);
		line(250,300,250,330);
		line(230,300,230,330);
		line(250,300,230,300);
		line(250,330,230,330);
		line(235,331,235,350);
		line(245,331,245,350);
		line(235,350,230,350);
		line(245,350,250,350);


		for(i=290;i<325;i++)
		 {
		 setcolor(8);
		 line(230,305,217,i);

		 delay(100);
		 setcolor(RED);
		 line(230,305,217,i);

		 }
		 setcolor(8);
		 line(230,305,217,325);

		 for(i=290;i<325;i++)
		 {
		 setcolor(8);
		 line(250,305,263,i);

		 delay(100);
		 setcolor(RED);
		 line(250,305,263,i);

		 }
		 setcolor(8);
		 line(250,305,263,325);



	       setcolor(15);
	       y=150;
	       line(170,70,150,200);
	       for(i=170;i<230;i=i+2,y=y+2)
		   {
		     delay(30);
		    line(i,70,y,200);
		    }
	       line(150,200,60,400);
	       y=60;
	       line(230,70,210,200);
	       for(i=150;i<212;i=i+2,y=y+2)
		   {
		    delay(30);
		    line(i,200,y,400);
		    }
	       line(210,200,123,400);
		y=0;
	       for(i=0;i<250;i=i+2,y=y+2)
		  line(i,400,y,450);
		   setcolor(9);
	  //DUCK
		fillellipse(200,400,20,10);
		circle(190,380,5);
		line(195,380,190,390);
		line(190,385,186,393);
		line(185,380,183,385);

	  //DUCK
		fillellipse(50,400,20,10);
		circle(40,380,5);
		line(45,380,40,390);
		line(40,385,36,393);
		line(35,380,32,385);
		for( i=300;i<400;i++)
		{

		 setcolor(BLUE);
		 outtextxy(i,150,"... HAPPY HOLI ..." );
		 delay(40);
		 setcolor(RED);
		 outtextxy(i,150,"... HAPPY HOLI ..." );

		 }

		 for( i=400;i>300;i--)
		{

		 setcolor(BLUE);
		 outtextxy(i,150,"... HAPPY HOLI ..." );
		 delay(40);
		 setcolor(RED);
		 outtextxy(i,150,"... HAPPY HOLI ..." );

		 }
		 setcolor(BLUE);
		 outtextxy(310,150,"... HAPPY HOLI ..." );
		 setcolor(BLUE);
		 outtextxy(440,440,"BY-:");
		 outtextxy(430,460,"( RANDHIR SINGH CHOUHAN )");

getch();
closegraph();
}
