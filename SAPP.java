import java.util.*;
public class SAPP
{
   public static void main(String args[])
   {
      char[] s={'R','P','M','E'};

     int left=0;
    int right=s.length-1;

    while(left<right)
    {
       char temp=s[left];
           s[left]=s[right];
           s[right]=temp;
    }

     for(int i=0;i<s.length;i++)
     {
      System.out.println(s[i]+" ");
     }  
   }
}