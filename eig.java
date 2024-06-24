import java.util.*;
public class eig
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  String s1=sc.next();
  String c=sc.next();
  System.out.println(s1.startsWith(c));
  System.out.println(s1.endsWith(c));
  int s=sc.nextInt();
  int e=sc.nextInt();
  System.out.println(s1.substring(s,e));
  System.out.println(s1.substring(s));
 }
}
