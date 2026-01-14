import java.util.*;
class Outer
{
   int a=100;

  class inner
  {
      public void show()
      {
         System.out.println("The value of a:"+a);
      }
  }
}
public class OIAPP
{
  public static void main(String args[])
  {
      Outer obj=new Outer();
      Outer.inner in=obj.new inner();
                  in.show();
  }
}