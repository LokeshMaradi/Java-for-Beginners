class Constructor
{
 int x,y;
 Constructor()
 {
  x=0;
  y=0;
  System.out.print("Default intialized x=0,y=0\n");
 }
 Constructor(int x,int y)
 {
  this.x=x;
  this.y=y;
  System.out.print("Values intialized i.e "+x+' '+y);
 }
}
public class constructoroverloading
{
 public static void main(String Arg[])
 {
  Constructor A=new Constructor();
  Constructor B=new Constructor(4,5);
 }
}
