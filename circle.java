class shape
{
double r;
public shape(double r)
{
 this.r=r;
}
 public double getArea()
 {
  return Math.PI*r*r;
 }
 public double getPerimeter()
 {
  return 2*Math.PI*r;
 } 
}
public class circle
{
 public static void main(String[] args)
 {
  shape c1,c2,c3;
  c1=new shape(5);
  System.out.println("area of c1:"+c1.getArea());
  System.out.println("perimeter of c1:"+c1.getPerimeter());
  c2=new shape(10);
  System.out.println("area of c2:"+c2.getArea());
  System.out.println("perimeter of c2:"+c1.getPerimeter());
  c3=new shape(15);
 System.out.println("area of c3:"+c3.getArea());
  System.out.println("perimeter of c3:"+c3.getPerimeter());
 }
}
