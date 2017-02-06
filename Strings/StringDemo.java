class StringDemo 
{
public static void main(String ar[])
 {
   String s1="   hello i am in java world    ";
   String s2="Hello";
System.out.println(s1.compareTo(s2));
System.out.println (s1.compareToIgnoreCase(s2));
System.out.println(s1.endsWith("lloo"));
 System.out.println(s2.getBytes()); 
System.out.println(s2.hashCode());
System.out.println(s1.indexOf('l',3));
System.out.println(s1.indexOf("i am"));
System.out.println(s1.replace('a','8'));
System.out.println(s1.intern());
System.out.println(s1.startsWith("eel"));
System.out.println(s1.trim());
}
}//end class 