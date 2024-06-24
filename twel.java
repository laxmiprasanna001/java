import java.util.*;
public class twel
{
static boolean contains(int a[],int x,int i)
  {
   for(int k=0;k<i;k++)
   {
    if(a[k]==x)
      return true;
 
   }
     return false;
  }
 public static void main(String[] args)
 {
  
  int c=0;
  Scanner sc=new Scanner(System.in);
  int a[]=new int[5];
  while(c<5)
  {
  System.out.println("enter input:");
   int x=sc.nextInt();
   if(x>=10 && x<=100 && !contains(a,x,c)){
   a[c]=x;
   c++;
   }
   else
     System.out.println("invalid or duplicate input");
  }
  System.out.println("unique:");
   for(int i:a)
 {
  System.out.println(i);
 }
 }
}
 
