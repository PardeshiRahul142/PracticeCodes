import java.util.*;
public class PAAPP
{  
   public static void main(String args[])
   {
       int num=7;
      
      Boolean isPrime=true;
      if(num <=1)
      {
         isPrime=false;
        return;
      }
 
     for(int i=2;i<num/2;i++)
     {
       if(num % i ==0)
       {
          isPrime=false;
           break; 
       }
     }

   if(isPrime)
   {  System.out.println("number is prime");
   }
   else
   {
      System.out.println("number is not primae");
   }
   }
}