import java.util.*;
class lamp
{
 boolean s;
 public lamp(boolean s)
 {
  this.s=s;
 }
 public void turnon()
 {
  if(s==true)
    System.out.println("already light is on");
  else
  {
   System.out.println("light is off");
   s=true;
   System.out.println("now it is turned on");
  }
 }
 public void turnoff()
 {
  if(s==false)
    System.out.println("already light is off");
  else
  {
   System.out.println("light is on");
   s=false;
   System.out.println("now it  is  tured off");
  }
 }
}
public class light
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  lamp led,halogen;
  int r;
  do
  {
  System.out.println("enter 1 to led,2 to halogen:");
    int n=sc.nextInt();

   switch(n)
   {
    case 1:
         led=new lamp(true);
         led.turnon();
         led.turnoff();
         break;
    case 2:
         halogen=new lamp(false);
         halogen.turnon();
         halogen.turnoff();
         break;
   }
   System.out.println("to continue 1,otherwise 0:");
   r=sc.nextInt();
  }while(r==1);
 }
}
