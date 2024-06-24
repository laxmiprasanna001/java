import java.util.*;
interface vehicle{
void getCompany(String n);
void getModel(String m);
void getType(String t);
void getConsumption(double d,String t);
}
class twow implements vehicle{
public void getCompany(String n)
{
 System.out.print("company:"+n);
}
public void getModel(String m)
{
System.out.print(" model:"+m);
}
public void getType(String t)
{
 System.out.print(" type:"+t);
}
public void getConsumption(double d,String t)
{
 if(t.equals("petrol"))
   System.out.print(" consumption:"+d/62);
 else if(t.equals("diesel"))
   System.out.print(" consumption:"+d/82);
 else if(t.equals("cng"))
   System.out.print(" consumption:"+d/72);
}
}
class fourw implements vehicle{
public void getCompany(String n)
{
  System.out.print("company:"+n);
}
public void getModel(String m)
{
 System.out.print(" model:"+m);
}
public void getType(String t)
{
  System.out.print(" type:"+t);
}
public void getConsumption(double d,String t)
{
 if(t.equals("petrol"))
    System.out.print(" consumption:"+d/14);
 else if(t.equals("diesel"))
    System.out.print(" consumption:"+d/22);
 else if(t.equals("cng"))
     System.out.print(" consumption:"+d/18);
}
}
public class three{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 twow tw=new twow();
 String a=sc.next();
 String b=sc.next();
 String c=sc.next();
 double d=sc.nextDouble();
 tw.getCompany(a);
 tw.getModel(b);
 tw.getType(c);
 tw.getConsumption(d,c);
 fourw fw=new fourw();
 a=sc.next();
 b=sc.next();
 c=sc.next();
 d=sc.nextDouble();
 fw.getCompany(a);
 fw.getModel(b);
 fw.getType(c);
 fw.getConsumption(d,c);
}
}
