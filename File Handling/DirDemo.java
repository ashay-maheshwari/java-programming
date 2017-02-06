import java.io.*;


class DirDemo 
{
public static void main(String ar[])
{
   String dirname="/java";

File f1=new File(dirname);

if(!f1.isDirectory())
  {
    System.out.println("directory name\t"+dirname);
  String s[]=f1.list();

for(int i=0;i<s.length;i++)
 {
  File f=new File(dirname+"/"+s[i]);
   if(f.isDirectory())
   {
     System.out.println(s[i]+" is a directory");
   }
  
else
{
System.out.println(s[i]+" is a file");
}

}//end loop
}//end if

else
{
System.out.println("is not  a directory");
}
}//end main
}//end class