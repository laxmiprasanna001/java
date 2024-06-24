import java.util.*;
class emp
{
int a;
String b;
int c;
char d;
String e;
double f;
String g;
public emp(int a,String b,int c,char d,String e,double f,String g)
{
 this.a=a;
 this.b=b;
 this.c=c;
 this.d=d;
 this.e=e;
 this.f=f;
 this.g=g;
}
}
public class ten
{
 public static void main(String[] args)
 {
  emp e1,e2,e3;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter id,name,age,gender,design,salary,address respectively:");
  int a=sc.nextInt();
String b=sc.next();
int c=sc.nextInt();
char d=sc.next().charAt(0);
String e=sc.next();
double f=sc.nextDouble();
String g=sc.next();
e1=new emp(a,b,c,d,e,f,g);
System.out.println("enter id,name,age,gender,design,salary,address respectively:");
a=sc.nextInt();
b=sc.next();
c=sc.nextInt();
d=sc.next().charAt(0);
e=sc.next();
f=sc.nextDouble();
g=sc.next();
e2=new emp(a,b,c,d,e,f,g);
System.out.println("enter id,name,age,gender,design,salary,address respectively:");
a=sc.nextInt();
b=sc.next();
c=sc.nextInt();
d=sc.next().charAt(0);
e=sc.next();
f=sc.nextDouble();
g=sc.next();
e3=new emp(a,b,c,d,e,f,g);
int id=sc.nextInt();
emp arr[]=new emp[3];
arr[0]=e1;
arr[1]=e2;
arr[2]=e3;
for(int i=0;i<arr.length;i++)
{
 if(id==arr[i].a)
 {
  System.out.println("id:"+arr[i].a+" name:"+arr[i].b+" age:"+arr[i].c+" gen:"+arr[i].d+" designation:"+arr[i].e+" salary:"+arr[i].f+" address:"+arr[i].g);
 }
}
 }
}
 
