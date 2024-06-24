import java.util.*;
class site
{
String name;
double discount;
 public site(String name,double discount)
 {
  this.name=name;
  this.discount=discount;
 }
 public double calculate(double p)
 {
  double d=p*(discount/100);
  return p-d;
 }
}
public class six
{
 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
  site amz=new site("amazon",0);
  site flip=new site("flip",0);
  System.out.println("enter yes if you are a hdfc acc holder:");
  String hdfc=sc.next();
  if(hdfc.equals("yes"))
  {
   amz.discount+=10;
  }
  System.out.println("enter your purchase amm:");
  double pch=sc.nextDouble();
  if(pch>50000)
    amz.discount+=15;
  System.out.println("enter yes if you are a rgukt stu:");
  String st=sc.next();
  if(st.equals("yes"))
     flip.discount+=30;
  System.out.println("enter your pch:");
  double pch1=sc.nextDouble();
  if(pch1>30000)
    flip.discount+=5;

   double disamtamz=amz.calculate(pch);
   double disamtflip=flip.calculate(pch1);
   if(disamtamz<disamtflip)
    System.out.println("it is better to buy from amazon");
   else if(disamtamz>disamtflip)
     System.out.println("it is better to buy from flipkart");
    else
      System.out.println("both are same");
  
 }
}

