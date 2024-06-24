import java.util.*;
class pro
{
 String name;
 int qty;
 double price;
 public pro(String name,int qty,double price)
 {
  this.name=name;
  this.qty=qty;
  this.price=price;
 }
}
public class elev
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  pro p1,p2,p3,p4,p5;
  System.out.println("enter p1:pname,pqty:");
 String name=sc.next();
 int qty=sc.nextInt();
  p1=new pro(name,qty,99.90);
  System.out.println("enter p2:pname,pqty:");
 name=sc.next();
 qty=sc.nextInt();
 p2=new pro(name,qty,20.20);
 System.out.println("enter p3:pname,pqty:");
 name=sc.next();
 qty=sc.nextInt();
 p3=new pro(name,qty,6.87);
 System.out.println("enter p4:pname,pqty:");
 name=sc.next();
 qty=sc.nextInt();
  p4=new pro(name,qty,45.50);
  System.out.println("enter p5:pname,pqty:");
 name=sc.next();
 qty=sc.nextInt();
 int r;
 double s=0;
  p5=new pro(name,qty,40.49);
  do
  {
   System.out.println("enter id:");
  int id=sc.nextInt();
  switch(id)
  {
   case 1:
         s+=p1.price*p1.qty;
         break;
   case 2:
         s+=p2.price*p2.qty;
         break;
   case 3:
         s+=p3.price*p3.qty;
         break;
   case 4:
         s+=p4.price*p4.qty;
         break;
   case 5:
         s+=p5.price*p5.qty;
         break;
   default:
         System.out.println("invalid");
         
  }
  r=sc.nextInt();
  }while(r==1);
   System.out.println("total retail price:"+s);
 }
 
}
