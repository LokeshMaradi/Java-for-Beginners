class A
{
 int x,y;
 public void set(int a,int b)
 {
  x=a;y=b;
 }
 
}
class B extends A
{
 int z;
 public void add()
 {
  z=x+y;
 }
 public void display()
 {
  System.out.print("Addition is "+z);
 }

}
class C extends B
{
 int k;
 
 public void mul()
 {
   System.out.print("\nMultiplication is "+super.x*super.y);
 }
 public void show()
 {
  System.out.print("\nX="+x+"\nY="+y);
 }
}
public class Inheritancebasic
{
 public static void main(String Arg[])
 {
 
  B two=new B(); 
  two.set(4,5);
  two.add();
  two.display();
  C three=new C();
  three.set(9,8);
  three.mul();
  three.show();
 }
}
 
