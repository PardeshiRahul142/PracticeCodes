import java.util.*;
public class myAtoi{
  public static void main(String args[])
  {
      String str="123-0";

      int res=0;
      int sign=1;
     int i=0;
      str=str.trim();

     if(str.length()== 0)
     {
         return 0;
     }

     if(str.charAt(i)=="-")
     {
          res=-1;
         i++;
    }
   if(str.charAt(i) == '+')
    {
       i++;
    }

   while(i<str.length())
   {
     char ch=str.charAt(i);
       if(ch.chatAt(i)<=0 && ch.chatAt(i)>9)
      {
         break;
      }

      res=res * 10 (ch -'0');

       if (sign * res > Integer.MAX_VALUE) return Integer.MAX_VALUE; // Handle overflow
            if (sign * res < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
  }
   
   int n=(int)(sing*res);

   System.out.println("n");
 
  }
}