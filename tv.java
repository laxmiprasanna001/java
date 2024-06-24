import java.util.*;
class tele
{
 int ch=1;
 int vol=1;
 boolean on;
 public void turnon()
 {
  on=true;
  System.out.println("turned on");
 }
 public void turnoff()
 {
  on=false;
  System.out.println("turned off");
 }
 public void setChannel(int ch)
 {
  this.ch=ch;
 }
  public void setVolume(int v)
 {
  this.vol=v;
 }
  public void channelUp()
 {if(ch>=1 && ch<=40)
   ch++;
 System.out.println("current channel:"+ch);
 }
 public void channelDown()
 {
 if(ch>=1 && ch<=40)
  ch--;
 System.out.println("current channel:"+ch);
 }
  public void volumeUp()
 {
 if(vol>=1 && vol<=7)
  vol++;
 System.out.println("current volume:"+vol);
 }
  public void volumeDown()
 {
 if(vol>=1 && vol<=7)
  vol--;
 System.out.println("current volume:"+vol);
 }
}
public class tv
{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 tele tv1=new tele();
 int t=1;;
 do
 {
  System.out.println("enter 1:on,2:off,3:setchannel,4:setvol,5:chaup,6:chdwn,7:volup,8:voldwn,9:");
  t=sc.nextInt();
  int ch,vol;
  switch(t)
  {
   case 1:
        tv1.turnon();
        break;
   case 2:
        tv1.turnoff();
        break;
   case 3:
        System.out.println("enter channel:");
        ch=sc.nextInt();
        tv1.setChannel(ch);
        break;
   case 4:
        System.out.println("enter vol:");
        vol=sc.nextInt();
        tv1.setVolume(vol);
        break;
   case 5:
        tv1.channelUp();
        break;
   case 6:
        tv1.channelDown();
        break;
   case 7:
        tv1.volumeUp();
        break;
   case 8:
        tv1.volumeDown();
        break;
   default:
       System.out.println("invalid");
  }
  System.out.println("enter 1 to continue:");
  t=sc.nextInt();
 }while(t==1);
}
}
