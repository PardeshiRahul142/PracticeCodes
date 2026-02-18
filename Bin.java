import java.util.*;
public class Bin
{        
   public static void main(String args[])
   {
      
       int n=5;
     boolean check=false;
      List<Integer> li=new ArrayList<Integer>();
     while(n>0)
     {  
       int bin=n%2;
       li.add(bin);
       n=n/2;
     }
     for(int i=0;i<li.size()-1;i++)
     {
         if(li.get(i)==li.get(i+1))
         {
           check=true;
            break;
         }   
     }
    if(!check)
    {
       System.out.println("true");
    }
    else
    {
       System.out.println("false");
    }
   }
}