import java.util.Bitset;

public class BitSetDemo
{
public static void main(String ar[])
{
BitSet bit1=new BitSet(16);
BitSet bit2=new BitSet(16);

//set some bits

for(int i=0;i<16;i++)
{
if((i%2)==0) bit1.set(i);
if((i%5)==0) bit2.set(i);
}

System.out.println("Initial pattern in bits1:");
System.out.println(bit1);
System.out.println("Initial pattern in bits12:");
System.out.println(bit2);


bit2.and(bit1);
System.out.println("\n bit1 anded with bit2");
System.out.println(bit2);

bit2.or(bit1);
 System.out.println("\nbits2 OR bits1: ");
     System.out.println(bit2);

     // XOR bits
     bit2.xor(bit1);
     System.out.println("\nbits2 XOR bits1: ");
     System.out.println(bit2);
	 }
	 }

