class avgadd
{
 static int x,y,z;
 public void set(int x,int y)
 {c
  this.x=x;this.y=y;
 }
 public static void add()
 {
  z=x+y;
  System.out.print("Addition is "+z);
 }
 public static void avg()
 {
  z=(x+y)/2;
  System.out.print("\nAverage is "+z);
 }
}
public class addavg
{
 public static void main(String Arg[])
 {
  avgadd A=new avgadd();
  A.set(4,5);
  A.add();
  A.avg();
 }
} 
  
  
