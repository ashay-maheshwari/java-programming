import java.awt.*;

class ManyFonts extends Frame
  {
    ManyFonts()
	 {
	  setSize(500,500);
	  setVisible(true);
	  
	  
    Font f=new Font("TimesRoman",Font.PLAIN,18);
	Font fb=new Font("TimesRoman",Font.BOLD,18);
	
	
	g.setFont(f);
	g.drawString("This is plain font",10,25);
	
	g.setFont(fb);
	g.drawString("This is bold font",10,15);
	

	  
	 }//end constructor

  
	
	public static void main(String a[])
	  {
	  new ManyFonts();
	  }//end main
	 }//end class 