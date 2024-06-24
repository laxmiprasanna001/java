import java.util.*;
abstract class employeeh{
abstract double getAmount(double nh,double phm);
}
class hourly extends employeeh
{
 double getAmount(double nh,double phm)
 {
  return nh*phm;
 }
}
abstract class employeew{
abstract double getAmount(double nw,double pwm);
}
class weekly extends employeew
{
 double getAmount(double nw,double pwm)
 {
  return nw*pwm;
 }
}
public class two{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 hourly h=new hourly();
 System.out.println("total wage of hourly emp:"+h.getAmount(3,100));
 weekly w=new weekly();
 System.out.println("total wage of weekly emp:"+h.getAmount(2,1000));
}
}

