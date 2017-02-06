import java.util.*;
import java.awt.*;
import java.awt.event.*;
class Typing extends Frame
 {
   
   
   String ashay="Just as you have class and instance variables, you also have class and instance methods,"; 
TextArea t1;
     Typing()
	 {
	 setSize(500,500);
	 setVisible(true);
   t1=new TextArea(15,15);
   setLayout(new FlowLayout());
    add(l1);
    int len=ashay.length();
	System.out.println(len);
	
	for(int i=0;i<len;i++)
	{
	try
	{
	char result=ashay.charAt(i);
	t1.setText(result);
    Thread.sleep(100);   
     }catch(Exception e){}
    }//end for
}//end constructor
  
  
public static void main(String ar[])
{  
 new Typing(); 
  }//end main

  }//end class   