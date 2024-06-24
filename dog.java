import java.util.*;
class anm
{
String n;
String b;
String c;
int h;
String t;
 public anm(String n,String b,String c,int h,String t)
 {
  this.n=n;
  this.b=b;
  this.c=c;
  this.h=h;
  this.t=t;
 }
 public String getName()
 {
  return n;
 }
 public String getBreed()
 {
  return b;
 }
 public int getHei()
 {
  return h;
 }
 public String getColor()
 {
  return c;
 }
 public String getType()
 {
  return t;
 }
}
public class dog
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  anm a=new anm("snoopy","pomerian","white",1,"gaurd");
  anm b=new anm("rocky","lab","brown",3,"sniffer");
  anm c=new anm("snowy","g.sheperd","black",4,"sheperd");
  int n;
  System.out.println("1.int,2.Str:");
  n=sc.nextInt();
  switch(n)
  {
   case 1:
         int h=sc.nextInt();
         if(h==1)
           System.out.println("snoopy");
         else if(h==3)
           System.out.println("rocky");
         else
           System.out.println("snowy");
           break;
   case 2:
         String s=sc.next();
        
         if(a.getBreed().equals(s) || a.getColor().equals(s) || a.getName().equals(s) || a.getType().equals(s))
           System.out.println("snoopy");
         else if(b.getBreed().equals(s) || b.getColor().equals(s) || b.getName().equals(s) || b.getType().equals(s))
           System.out.println("rocky");
         else if(c.getBreed().equals(s) || c.getColor().equals(s) || c.getName().equals(s) || c.getType().equals(s))
           System.out.println("g.sheperd");
         break;     
  }
 }
}
