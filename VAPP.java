import java.util.*;
class VARARG
{  
   public void StudentAvg(String name,int ...mark)
   {
       int sum=0;
      for(int i=0;i<mark.length;i++)
      {
         sum=sum+mark[i];
      }
       int avg=sum/mark.length;
       System.out.println("Student marks avg is :"+avg);
   }
}
public class VAPP
{
   public static void main(String argsp[])
   {
      VARARG a=new VARARG();
           a.StudentAvg("Aakash",90,90,79,97,96,70,70);
   }
}