import java.util.*;
class VAR
{  int sum=0;
   int avg=0;
   public void sumOF(int ...x)
   {
      for(int i=0;i<x.length;i++)
      {
        sum+=x[i];
      }
 
      avg=sum/x.length;
   }
  void display()
  {  
     System.out.println("Sum of marks :"+avg);
  }

}
public class VARAPP
{
   public static void main(String args[])
   {
      VAR v=new VAR();
      v.sumOF(10,20,30,40,50);
      v.display();
   }
}