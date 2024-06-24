import java.util.*;
public class seven
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  String s1=sc.next();
  int k=0;
  char c[]=new char[s1.length()]; 
  for(int i=s1.length()-1;i>=0;i--)
  {
   c[k]=s1.charAt(i);
   k++;
  }
  String s=new String(c);
  System.out.println(s);
 }
 }
