import java.util.*;
public class thirt
{
 public static void main(String[] args)
 {
 Random r=new Random();
 int s=0;
 for(int i=1;i<=10;i++)
 {
   int d1=r.nextInt(6)+1;
   int d2=r.nextInt(6)+1;
   System.out.println("attempt:"+i+"d1-"+d1+" d2-"+d2);
   if(d1==d2)
   {
    s++;
   }
   try{
   Thread.sleep(10000);
   }
   catch(InterruptedException e)
   {
   }
 }
 System.out.println("successfull attempts:"+s);
 }
}
