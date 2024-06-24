import java.util.*;
abstract class shape1{
abstract double getArea(double r);
abstract double getPerimeter(double r);
}
abstract class shape2{
abstract double getArea(double r);
abstract double getVolume(double r);
}
class circle extends shape1{
double getArea(double r)
{
 return Math.PI*r*r;
}
double getPerimeter(double r)
{
 return 2*Math.PI*r;
}
}
class square extends shape1{
double getArea(double r)
{
 return r*r;
}
double getPerimeter(double r)
{
 return 4*r;
}
}
class sphere extends shape2{
double getArea(double r)
{
 return 4*Math.PI*r*r;
}
double getVolume(double r)
{
 return (4/3)*Math.PI*r*r*r;
}
}
class cube extends shape2{
double getArea(double r)
{
 return 6*r*r;
}
double getVolume(double r)
{
 return r*r*r;
}
}
public class one{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 circle c=new circle();
 System.out.println("circle area:"+c.getArea(2));
 System.out.println("circle perimeter:"+c.getPerimeter(2));
 square s=new square();
 System.out.println("square area:"+s.getArea(4));
 System.out.println("square perimeter:"+s.getPerimeter(4));
 sphere sp=new sphere();
 System.out.println("sphere area:"+sp.getArea(2));
 System.out.println("sphere volume:"+sp.getVolume(2));
 cube cb=new cube();
 System.out.println("cube area:"+cb.getArea(3));
 System.out.println("cube volume:"+cb.getVolume(3));
}
}
