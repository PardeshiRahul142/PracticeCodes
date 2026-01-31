import java.util.*;
class A{

  public static void show()
  {
    System.out.println("I am parent show");
  }
}
class B extends A{
  
   public static void show()
   { show();
     System.out.println("I am child show");
   }
}
public class FCAPP
{
   public static void main(String args[])
   {
      //A a=new B();
      // a.show();
     B.show();
 
   }
}