import java.io.*;

class ReadDemo 
{

public static void main(String atr[])
{
  try{
          File f=new File("abc.jpg");
           FileInputStream fis=new FileInputStream(f);

		for(int i=0;i<f.length();i++)
			{
				System.out.print(fis.read());
                        }

      }catch(Exception e){}
}//end main
}//end class