import java.util.*;
public class RotAPP
{
   public static void main(String args[])
   {
     int a[]={10,20,30,40,50};
     int k=2;
     for(int i=0;i<=k;i++)
     {  int temp=a[0];

        for(int j=0;j<a.length-1;j++)
         {
            a[j]=a[j+1];
         } 
       a[a.length-1]=temp;
     }
    for(int i=0;i<a.length;i++)
    {
      System.out.print(" "+a[i]);
    }
   }
}