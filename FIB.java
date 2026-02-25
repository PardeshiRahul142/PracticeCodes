import java.util.*;
public class FIB
{
   public static void main(String args[])
   {
      int a=0;
      int b=1;
   
      int n=10;

      for(int i=0;i<n;i++)
     {
        int c=a+b;
       System.out.println(c);
       a=b;
       b=c;
     }
   }
}C:\Users\rahul\AppData\Roaming\Microsoft\Windows\Start Menu\Programs\Eclipse