import java.util.*;
class book{
 String bname;
 String author;
 int c;
 public book(String bname,String author,int c)
 {
  this.bname=bname;
  this.author=author;
  this.c=c;
 }
 public String getName()
 {
  return bname;
 }
 public int getCount()
 {
  return c;
 }
 public void sellbook()
 {
 if(c>0)
   c--;
 else
   System.out.println("sorry books are not available");
 }
}
class customer{
 int cid;
 String name;
 String add;
 public customer(int cid,String name,String add)
 {
  this.cid=cid;
  this.name=name;
  this.add=add;
 }
 public void buybook(book b)
 {
   System.out.println("customer-"+name+" is buying a book:"+b.getName());
   b.sellbook();
 } 
}
public class fourt{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 book b1,b2,b3;
 System.out.println("book1:\n bname,author,count:");
 String bname=sc.next();
 String author=sc.next();
 int ct=sc.nextInt();
 b1=new book(bname,author,ct);
 System.out.println("book2:\n bname,author,count:");
 bname=sc.next();
 author=sc.next();
 ct=sc.nextInt();
 b2=new book(bname,author,ct);
 System.out.println("book3:\n bname,author,count:");
 bname=sc.next();
 author=sc.next();
 ct=sc.nextInt();
 b3=new book(bname,author,ct);
 book b[]=new book[3];
  b[0]=b1;
  b[1]=b2;
  b[2]=b3;
 customer c1,c2;
 System.out.println("customer1:\n cid,cname,address:");
 int cid=sc.nextInt();
 String name=sc.next();
 String add=sc.next();
 c1=new customer(cid,name,add);
  System.out.println("customer2:\n cid,cname,address:");
cid=sc.nextInt();
 name=sc.next();
 add=sc.next();
 c2=new customer(cid,name,add);
 customer c[]=new customer[2];
 c[0]=c1;
 c[1]=c2;
 c[0].buybook(b[0]);
 c[0].buybook(b[1]);
 c[1].buybook(b[0]);
 c[1].buybook(b[1]);
 c[0].buybook(b[2]);
 c[1].buybook(b[2]);
 for(int i=0;i<3;i++){
 System.out.println("book:"+b[i].getName()+"count:"+b[i].getCount());
 }
}
}
