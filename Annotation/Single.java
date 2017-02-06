import java.lang.annotation.*;
import java.lang.*;

@Retention(RetentionPolicy.RUNTIME)

@interface MySingle
  {
  int value();
  }//end interface
  
  
  public class Single
  {
  //annotate a single method using a marker
     
	   @MySingle(100)
	   
	   public static void Mymeth()
	     {
		   Single ob=new Single();
		   try
		    {
			 Method m=ob.getClass().getMethod("Mymeth");
			 MySingle anno=m.getAnnotation(MySingle.class);
			 System.out.println("The value is "+anno.value());
			}catch(Exception e){}
			
		}//end function


    public static void main(String ar[])
      {	
	  Mymeth();
	  }//end main
	  }//end class
			