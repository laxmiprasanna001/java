import java.util.*;
interface rbi{
void credit(double bal);
void debit(double amt);
void display();
void personalloan(double ai,String jt);
void homeloaneligibility(double ai,String jt,boolean op);
void vehicleeligibility(double ai,boolean mf);
}
class sbi implements rbi{
double bal;
public sbi(double bal)
{
 this.bal=bal;
}
public void credit(double amt)
{
 bal+=amt;
 System.out.println("credited");
}
public void debit(double amt)
{
 if(bal>500 && bal>amt)
 {
   bal-=amt;
   System.out.println("debited");
 }
 else
   System.out.println("insufficient");
}
public void display()
{
 System.out.println("balance:"+bal);
}
public void personalloan(double ai,String jt)
{
 if(ai<90000 && jt.equals("private"))
    System.out.println("loan is sanctioned");
 else
    System.out.println("loan appeal was  rejected");
}
public void homeloaneligibility(double ai,String jt,boolean op)
{
 if(ai>100000 && jt.equals("govt") && op==true)
    System.out.println("loan is sanctioned");
 else
    System.out.println("loan appeal was  rejected");
}
public void vehicleeligibility(double ai,boolean mf)
{
 if(ai<100000 && mf==true)
    System.out.println("loan is sanctioned");
 else
  System.out.println("loan appeal was  rejected");
}
}
class hdfc implements rbi{
double bal;
public hdfc(double bal)
{
 this.bal=bal;
}
public void credit(double amt)
{
 bal+=amt;
 System.out.println("credited");
}
public void debit(double amt)
{
 if(bal>1000 && bal>=amt)
 {
   bal-=amt;
   System.out.println("debited");
 }
 else
   System.out.println("insufficient");
}
public void display()
{
 System.out.println("balance:"+bal);
}
public void personalloan(double ai,String jt)
{
 if(ai>90000 && jt.equals("govt"))
    System.out.println("loan is sanctioned");
 else
    System.out.println("loan appeal was  rejected");
}
public void homeloaneligibility(double ai,String jt,boolean op)
{
 if(ai>200000 && jt.equals("govt") && op==true)
    System.out.println("loan is sanctioned");
 else
    System.out.println("loan appeal was rejected");
}
public void vehicleeligibility(double ai,boolean mf)
{
 if(ai>100000 && mf==true)
    System.out.println("loan is sanctioned");
 else
  System.out.println("loan appeal was  rejected");
}
}
class dcb implements rbi{
double bal;
public dcb(double bal)
{
 this.bal=bal;
}
public void credit(double amt)
{
 bal+=amt;
 System.out.println("credited");
}
public void debit(double amt)
{
 if(bal>500 && bal>amt)
 {
   bal-=amt;
   System.out.println("debited");
 }
 else
   System.out.println("insufficient");
}
public void display()
{
 System.out.println("balance:"+bal);
}
public void personalloan(double ai,String jt)
{
 if(ai>90000 && jt.equals("govt") && bal>=10000)
    System.out.println("loan is sanctioned");
 else
    System.out.println("loan appeal was  rejected");
}
public void homeloaneligibility(double ai,String jt,boolean op)
{
 if(ai>100000 && jt.equals("private") && op==true)
    System.out.println("loan is sanctioned");
 else
    System.out.println("loan appeal was rejected");
}
public void vehicleeligibility(double ai,boolean mf)
{
 if(ai>100000 && mf==true)
    System.out.println("loan is sanctioned");
 else
  System.out.println("loan appeal was  rejected");
}
}
public class five
{
 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 double bal=sc.nextDouble();
 sbi a=new sbi(bal);
 double amt=sc.nextDouble();
 a.credit(amt);
 double damt=sc.nextDouble();
 a.debit(damt);
 a.display();
 double ai=sc.nextDouble();
 String jt=sc.next();
 a.personalloan(ai,jt);
 boolean op=sc.nextBoolean();
 a.homeloaneligibility(ai,jt,op);
 boolean mf=sc.nextBoolean();
 a.vehicleeligibility(ai,mf);
 bal=sc.nextDouble();
 hdfc b=new hdfc(bal);
 amt=sc.nextDouble();
 b.credit(amt);
 damt=sc.nextDouble();
 b.debit(damt);
 b.display();
 ai=sc.nextDouble();
 jt=sc.next();
 b.personalloan(ai,jt);
 op=sc.nextBoolean();
 b.homeloaneligibility(ai,jt,op);
 mf=sc.nextBoolean();
 b.vehicleeligibility(ai,mf);
 bal=sc.nextDouble();
 dcb c=new dcb(bal);
 amt=sc.nextDouble();
 c.credit(amt);
 damt=sc.nextDouble();
 c.debit(damt);
 c.display();
 ai=sc.nextDouble();
 jt=sc.next();
 c.personalloan(ai,jt);
 op=sc.nextBoolean();
 c.homeloaneligibility(ai,jt,op);
 mf=sc.nextBoolean();
 c.vehicleeligibility(ai,mf);
 }
}
