package matrix;
import java.util.Scanner;
import java.io.*;

class MatrixOperation
   {
       int A[][]=new int[50][50];
       int B[][]=new int[50][50];
     int C[][]=new int[50][50];
int i,j, r1,c1,r2,c2,k,sum=0;

Scanner sc=new  Scanner(System.in);

public void input()
          {
  System.out.println("Enter the Row of matrix1:");
   r1=sc.nextInt();
System.out.println("Enter the Column of matrix1:");
   c1=sc.nextInt();
System.out.println("Enter the Elements of matrix1:");

//LOOP STARTS
  for(i=0;i<r1;i++)
   {
     for(j=0;j<c1;j++)
       {
         System.out.print("index["+i+"]["+j+"]=");
A[i][j]=sc.nextInt();
     }
  }//END OF LOOP FOR MATRIX1


System.out.println("Enter the Row of matrix2:");
   r2=sc.nextInt();
System.out.println("Enter the Column of matrix2:");
   c2=sc.nextInt();
System.out.println("Enter the Elements of matrix2:");

//LOOP STARTS FOR MATRIX2
  for(i=0;i<r2;i++)
   {
     for(j=0;j<c2;j++)
       {
         System.out.print("index["+i+"]["+j+"]=");
B[i][j]=sc.nextInt();
     }
  }//END OF LOOP
}//END OF FUNCTION


//FUNCTION FOR ADDING MATRICES
public void add()
 {
//LOOP FOR ADDING MATRICES
      if(r1==r2 || c1==c2)
        {
           for(i=0;i<r1;i++)
           {
   	  for(j=0;j<c1;j++)
       	     {
      	       C[i][j]=A[i][j]+B[i][j];
                     }
         }//END OF LOOP
}//END OF if
       else
System.out.println("Matrix addition not possible:(");
System.out.println("Matrix addition is:(\n");

//LOOP FOR PRINTING ADDED MATRICES  
             for(i=0;i<r1;i++)
                    {    
                 System.out.print("\n");
   	  for(j=0;j<c1;j++)
       	     {
      	System.out.print("\t"+C[i][j]);      
                     }
                 }//END OF LOOP
}//END OF FUNCTION	

//FUNCTION FOR SUBSTRACTING MATRICES
public void substract()
    {
//LOOP FOR SUBSTRACTING MATRICES
      if(r1==r2 || c1==c2)
        {
           for(i=0;i<r1;i++)
           {
   	  for(j=0;j<c1;j++)
       	     {
      	       C[i][j]=A[i][j]-B[i][j];
                     }
         }//END OF LOOP
      }//END OF if
       else
System.out.println("Matrix substraction not possible:(");
System.out.println("\nMatrix substraction is:(\n");

//LOOP FOR PRINTING SUBSTRCATED MATRICES  
             for(i=0;i<r1;i++)
                    {    
                 System.out.print("\n");
   	  for(j=0;j<c1;j++)
       	     {
      	System.out.print("\t"+C[i][j]);      
                     }
                 }//END OF LOOP
}//END OF FUNCTION	

//FUNCTION FOR MULTIPLICATION
public void multiply()
  {


   if(r1==c1)//CHECKING IF MULTI POSSIBLE
     {   
//LOOP FOR MULTIPLICATION
for(i=0;i<r1;i++)
 {
   for(j=0;j<c2;j++)
   {
   for(k=0;k<r2;k++)
      {
        C[i][j]=C[i][j]+A[i][k]*B[k][j];
      }
   }
 }//END OF LOOP
    }//END OF if

else 
System.out.println("Multiplication not possible:(");

System.out.println("\nMultiplication is :(");

//LOOP FOR PRINTING MULTIPLIED MATRICES  
             for(i=0;i<r1;i++)
                    {    
                 System.out.print("\n");
   	  for(j=0;j<c1;j++)
       	     {
      	System.out.print("\t"+C[i][j]);      
                     }
                 }//END OF LOOP
  
}//END OF FUNCTION 

//FUNCTION FOR TRANSPOSE MATRIX
public void transpose()
  { 
 //LOOP FOR TRANSPOSE MATRIX    
              for(i=0;i<r1;i++)
                    {    
   	  for(j=0;j<c1;j++)
       	     {
      	B[j][i]=A[i][j];     
                     }
                 }//END OF LOOP
  
//LOOP FRO PRINTING MATRIX TRANSPOSE
System.out.println("\nMatrix transpose is:)");
           for(i=0;i<r1;i++)
                    {    
              System.out.println("\n"); 
   	  for(j=0;j<c1;j++)
       	     {
      	System.out.print("\t"+B[i][j]);  
                     }
                 }//END OF LOOP
}//END OF FUNCTION

//FUNCTION FOR DIAGONAL MATRIX AND ITS SUM
public void diagonal()
 {

System.out.println("\nDiagonal elements of matrix1 is:)");
          for(i=0;i<r1;i++)
                    {    
           
   	  for(j=0;j<c1;j++)
       	     { 
    		if(i==j)
      	System.out.print("\t"+A[i][i]);  
                     }
                 }//END OF LOOP
  

System.out.println("\nDiagonal elements of matrix2 is:)");
          for(i=0;i<r2;i++)
                    {    
           
   	  for(j=0;j<c2;j++)
       	     { 
    		if(i==j)
      	System.out.print("\t"+B[i][i]);  
                     }
                 }//END OF LOOP


           for(i=0;i<r2;i++)
                    {    
           for(j=0;j<c2;j++)
       	     { 
    		if(i==j)
      	sum=sum+A[i][j]+B[i][j];
                     }
                 }//END OF LOOP

System.out.println("\n\tSUM of diagonals="+sum);
                   
 }//END OF FUNCTION

//FUNCTION FOR FINDING MAXIMUM ELEMENT OF MATRIX
public void maxElement()
    {
         int max=0,max1=0;
 max=A[0][0];
for(i=0;i<r1;i++)
   {
     for(j=0;j<c1;j++)
       {
   if(max<A[i][j])
max=A[i][j];       
     }
  }//END OF LOOP
System.out.println("\nMax element of matrix1 is "+max);

max1=B[0][0];
for(i=0;i<r2;i++)
   {
     for(j=0;j<c2;j++)
       {
   if(max1<B[i][j])
max=B[i][j];       
     }
  }//END OF LOOP
System.out.println("\nMax element of matrix2 is "+max1);
}//END OF FUNCTION


//FUNCTION FOR SPARSE MATRIX
public void sparse()
   {
       int ct1=0,ct2=0;
for(i=0;i<r1;i++)
   {
    for(j=0;j<c1;j++)
   {
      if(A[i][j]==0)
       ct1++;
   else 
      ct2++;
   }
  }//END OF LOOP
if(ct1>ct2)
System.out.println("\n Matrix1 is Sparse matrix:");
else 
System.out.println("\n Matrix1 is not Sparse matrix:");

ct1=0;ct2=0;
for(i=0;i<r2;i++)
   {
    for(j=0;j<c2;j++)
   {
      if(B[i][j]==0)
       ct1++;
   else 
      ct2++;
   }
  }//END OF LOOP
if(ct1>ct2)
System.out.println("\n Matrix2 is Sparse matrix:");
else 
System.out.println("\n Matrix2 is not Sparse matrix:");
}//END OF FUNCTION



//FUNCTION FOR UPPER TRAINGLE MATRIX
public void upper()
  {
  sum=0;
System.out.println("\n The elements in upper traingle matrix1:\n");
for(i=0;i<r1;i++)
   {
    for(j=0;j<c1;j++)
   {
      if(i<=j)
{
System.out.println("\t"+A[i][j]);
sum=sum+A[i][j];
}
       }
  }//END OF LOOP

System.out.println("\n Sum of upper traingle  element matrix1:"+sum);

  sum=0;
System.out.println("\n The elements in upper traingle matrix2:\n");
for(i=0;i<r2;i++)
   {
    for(j=0;j<c2;j++)
   {
      if(i<=j)
{
System.out.println("\t"+B[i][j]);
sum=sum+B[i][j];
}
       }
  }//END OF LOOP

System.out.println("\n Sum of upper traingle  element matrix2:"+sum);


}//END OF FUNCTION



//FUNCTION FOR STRICTLY UPPER TRAINGLE MATRIX
public void strictUpper()
  {
  sum=0;
System.out.println("\n The elements in strictly upper traingle matrix1:\n");
for(i=0;i<r1;i++)
   {
    for(j=0;j<c1;j++)
   {
      if(i<j)
{
System.out.println("\t"+A[i][j]);
sum=sum+A[i][j];
}
       }
  }//END OF LOOP

System.out.println("\n Sum of strictly upper traingle  element matrix1:"+sum);

  sum=0;
System.out.println("\n The elements in strictly upper traingle matrix2:\n");
for(i=0;i<r2;i++)
   {
    for(j=0;j<c2;j++)
   {
      if(i<j)
{
System.out.println("\t"+B[i][j]);
sum=sum+B[i][j];
}
       }
  }//END OF LOOP

System.out.println("\n Sum of strictly upper traingle  element matrix2:"+sum);


}//END OF FUNCTION


//FUNCTION FOR LOWER TRAINGLE MATRIX
public void lower()
  {
  sum=0;
System.out.println("\n The elements in lower traingle matrix1:\n");
for(i=0;i<r1;i++)
   {
    for(j=0;j<c1;j++)
   {
      if(i>=j)
{
System.out.println("\t"+A[i][j]);
sum=sum+A[i][j];
}
       }
  }//END OF LOOP

System.out.println("\n Sum of lower traingle  element matrix1:"+sum);

  sum=0;
System.out.println("\n The elements in lower  traingle matrix2:\n");
for(i=0;i<r2;i++)
   {
    for(j=0;j<c2;j++)
   {
      if(i>=j)
{
System.out.println("\t"+B[i][j]);
sum=sum+B[i][j];
}
       }
  }//END OF LOOP

System.out.println("\n Sum of  Lower traingle  element matrix2:"+sum);


}//END OF FUNCTION

//FUNCTION FOR STRICTLY LOWER TRAINGLE MATRIX
public void strictLower()
  {
  sum=0;
System.out.println("\n The elements in strictly lower traingle matrix1:\n");
for(i=0;i<r1;i++)
   {
    for(j=0;j<c1;j++)
   {
      if(i>j)
{
System.out.println("\t"+A[i][j]);
sum=sum+A[i][j];
}
       }
  }//END OF LOOP

System.out.println("\n Sum of strictly lower traingle  element matrix1:"+sum);

  sum=0;
System.out.println("\n The elements in strictly lower  traingle matrix2:\n");
for(i=0;i<r2;i++)
   {
    for(j=0;j<c2;j++)
   {
      if(i>j)
{
System.out.println("\t"+B[i][j]);
sum=sum+B[i][j];
}
       }
  }//END OF LOOP

System.out.println("\n Sum of  strictly Lower traingle  element matrix2:"+sum);


}//END OF FUNCTION







}//END OF CLASS

 
