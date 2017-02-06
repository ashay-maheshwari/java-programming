import java.io.*;
import java.awt.event.*;
import java.awt.*;

class Good 
{
public static void main(String ar[])
{

String taa="I ashay am am";
//         


String tfa="am";



int temp[]=new int[40];


char TAA[]=taa.toCharArray();

char TFA[]=tfa.toCharArray();
System.out.println("\n\n");


int abc=taa.length();
System.out.println("***"+abc);



try
{


for(int m=0;m<taa.length();m++)
{
System.out.print(TAA[m]);
}

System.out.println("\nSAB THEEK HAI");




int len=tfa.length();
System.out.println("LENGTH OF textfield is:"+len);

int len1=taa.length();
System.out.println("LENGTH OF textarea is:"+len1);


int i,j,count=0,flag=0,sigma=0;

len1++;

for(i=0,j=0;i<len1-1;i++,j++)
  {
++sigma;

System.out.println("VLAUE OF sigma="+sigma);    

	if(j<len)
           {
System.out.println("VLAUE OF j="+j);   

 		if(TAA[i]==TFA[j])
                  { 
System.out.println("inside if1");
  
                      System.out.println("flag="+flag++);
                      temp[count]=i;
                      System.out.println("######"+count+"&&&&"+temp[count]);
                      count++;                    
                  }

               if(j==len-1)
                   {
               System.out.println("inside if2");
                    j=0;
                   }
           

          if(TAA[i+1]==' ')
           {
                System.out.println("inside if3");

                i++;j=j-1;

           }
System.out.println("**********************************************");




if(sigma==10)
{
goto sos;
}

   }
}//for loop ends
sos:System.out.println("outseide loop:");

System.out.println("VALUE OF FLAG IS="+flag);

for(i=0;i<flag+1;i++)
{
System.out.println("inside for loop of temp[]");
System.out.println(temp[i]);

}


System.out.println("\n\n\nEVERY THING IS FINE:\n\n\n");




System.out.println("len1 is"+len1);

for(i=0,count=0;i<len1;i++,count++)
{

  int x=temp[count];
      int y=temp[count+1];

if(x+1==y)
   {
   

   
       System.out.println(TAA[x]+""+TAA[y]);

   }
    ; 
/*if(count==flag-1)
{
System.out.println("END LOOP");
break;
} */}

                   
}catch(Exception e){}


}
}



