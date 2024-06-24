import java.util.*;
interface fare{
double getFare(String s,double d,double f);
String getAmenities(String s);
} 
class bus implements fare{
public double getFare(String s,double d,double f)
{
 if(s.equals("ac"))
   return d*f*1000;
 else if(s.equals("nac"))
   return 500*d*f;
 else if(s.equals("sleeper"))
    return 800*d*f;
 else 
    return 300*d*f;
   
}
public String getAmenities(String s)
{
 if(s.equals("ac"))
   return "sleep berths,food,wifi,ac";
 else if(s.equals("nac"))
   return "wifi,sleep berths";
 else if(s.equals("sleeper"))
    return "wifi,food,sleep berths";
 else 
    return "snacks,sleep berths";
}
}
class train implements fare{
public double getFare(String s,double d,double f)
{
 if(s.equals("ac"))
   return d*f*100;
 else if(s.equals("sleeper"))
    return 800*d*f;
 else 
    return 300*d*f;
}
public String getAmenities(String s)
{
 if(s.equals("ac"))
   return "sleep berths,food,wifi,ac";
 else if(s.equals("nac"))
   return "wifi,sleep berths";
 else if(s.equals("sleeper"))
    return "wifi,food,sleep berths";
 else 
    return "snacks,sleep berths,food";
}
}
class flight implements fare{
public double getFare(String s,double d,double f)
{
 if(s.equals("economy"))
   return d*f*1000;
 else 
   return 500*d*f;
}
public String getAmenities(String s)
{
 if(s.equals("economy"))
   return "ac,food,wifi,air hoster services";
 else 
   return "wifi,sleep berths,food";
}
}
public class four{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 String s=sc.next();
 bus b=new bus();
 double d=sc.nextDouble();
 double f=sc.nextDouble();
 System.out.println("fare for bus:"+b.getFare(s,d,f));
  System.out.println("amenities:"+b.getAmenities(s));
  s=sc.next();
 train t=new train();
 d=sc.nextDouble();
 f=sc.nextDouble();
 System.out.println("fare for train:"+t.getFare(s,d,f));
 System.out.println("amenities:"+t.getAmenities(s));
 s=sc.next();
 flight fl=new flight();
 d=sc.nextDouble();
 f=sc.nextDouble();
 System.out.println("fare for train:"+fl.getFare(s,d,f));
 System.out.println("amenities:"+fl.getAmenities(s));
}
}
