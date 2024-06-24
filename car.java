import java.util.*;
class v
{
 String cmp,clr;
 double m,s;
 public v(String c1,double mil,double spd,String c2)
 {
  cmp=c1;
  m=mil;
  s=spd;
  clr=c2;
 } 
 public double getMileage()
 {
  return m;
  }
  public double getSpeed()
  {
   return s;
  }
  public String getCompany()
  {
   return cmp;
  } 
}
public class car{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("car1:");
 String company=sc.next();
 double mil=sc.nextDouble();
 double speed=sc.nextDouble();
 String color=sc.next(); 
 v f=new v(company,mil,speed,color);
 System.out.println("car2:");
 company=sc.next();
 mil=sc.nextDouble();
 speed=sc.nextDouble();
 color=sc.next(); 
 v t=new v(company,mil,speed,color);
 System.out.println("car3:");
 company=sc.next();
 mil=sc.nextDouble();
 speed=sc.nextDouble();
 color=sc.next(); 
 v vl=new v(company,mil,speed,color);
 double a,b,c;
 a=(f.getSpeed())/(f.getMileage());
 b=(t.getSpeed())/(t.getMileage());
 c=(vl.getSpeed())/(vl.getMileage());
 if(a<b && a<c)
   System.out.println(f.getCompany());
 else if(b<c)
   System.out.println(t.getCompany());
 else
   System.out.println(vl.getCompany());
}
}
