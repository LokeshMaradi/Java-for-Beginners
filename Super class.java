class one
{
 int x,y;
 one()
 {
  System.out.print("In class one\n");
 }
 public void set(int x,int y)
 {
  this.x=x;this.y=y;
  System.out.print("\nX="+x+" Y="+y);
 }
}
class two extends one
{
 two(int x,int y)
 {
  this.x=x;this.y=y;
  System.out.print("\nX="+x+" Y="+y);
 }
 public void displayparent()
 {
  super.set(5,6);
 }
}
public class Super
{
 public static void main(String Arg[])
 {
  two A=new two(2,3);
  A.set(4,5);
  A.displayparent();
 }
}

  
