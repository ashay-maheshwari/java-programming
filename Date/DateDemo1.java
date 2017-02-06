import java.util.*;
import java.text.*;


public class DateDemo1
{
public static void main(String ar[])
 {
  Date dnow=new Date();

SimpleDateFormat ft=new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzzz");
System.out.println("Current Date:"+ft.format(dnow));

SimpleDateFormat ft1=new SimpleDateFormat("D yyyy.MM.dd 'at' HH:MM:ss a zzzz");
System.out.println("Current Date:"+ft1.format(dnow));

SimpleDateFormat ft2=new SimpleDateFormat("F yyyy.MM.dd 'at' HH:MM:ss a zzzz");
System.out.println("Current Date:"+ft2.format(dnow));


}
}