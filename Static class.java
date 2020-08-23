class Static
{ 
 static int x;
 int y;
 public void a(int x)
 {
  this.x=x;
 } 
 public static void A()
 {
  x++;
 }
 public void B()
 {
  x++;
  y++;
 } 
 public void display()
 {
  System.out.print("X="+x+"Y="+y+"\n");
 }
public void b(int y)
 {
  y=y;
  }
}
public class runstatic
{
 public static void main(String Arg[])
{
 Static one=new Static();
 one.a(4);
 one.display();
 one.A();
 one.B();
 one.display();
 one.b(4);
 one.display();
 Static two=new Static();
 System.out.print("\nIn second member now:\n");
 two.display();
 two.a(3);
 two.display();

}
}
