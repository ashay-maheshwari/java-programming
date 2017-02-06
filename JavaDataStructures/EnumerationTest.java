import java.util.Vector;
import java.util.Enumeration;

public class EnumerationTest
{
public static void main(String ar[])
{
Enumeration days;
Vector daynames=new Vector();
daynames.add("sunday");
daynames.add("monday");
daynames.add("tuesday");
daynames.add("wednesday");
daynames.add("thursday");
days=daynames.elements();

while(days.hasMoreElements())
 {
  System.out.println(days.nextElement());
  }
  }
  }//end class