import java.util.*;
public class ArrRet
{
  public static int []getArray()
  {
     int a[]={1,2,3};

     return a;

  }
  
 public static void main(String args[])
 {
 
   int a[]=getArray();

   for(int i=0;i<a.length;i++)
   {
    System.out.println(a[i]);
   }
 }
}