import java.util.*;
interface ABC
{
   void show();
}
public class ABCAPP
{
   public static void main(String args[])
   {
       ABC a=()->System.out.println("I am show");
           a.show();
   }
}