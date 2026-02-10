/*Q27. Write a java program to Check If a Number Is a Happy Number or Not.
Example : A number is called happy if it leads to 1 after a sequence of steps wherein each step number is replaced by the sum of squares of its digit, that is if we start with Happy Number and keep replacing it with digits square sum, we reach 1.
        	Input: n = 19
        	Output: True
        	19 is Happy Number,
        	1^2 + 9^2 = 82
        	8^2 + 2^2 = 68
        	6^2 + 8^2 = 100
        	1^2 + 0^2 + 0^2 = 1
        	As we reached 1, 19 is a Happy Number.
*/

import java.util.*;
public class HAP
{  public static void main(String args[])
  { 
     int n=7;
    int rem=0;
    int sum=0;
    int num=n;

    while(num!=1 && num!=4)
    {
       while(num > 0)
       {
          rem=num%10;
          sum+=rem*rem;
          num/=10;
       }
     num=sum;
     sum=0;
    }
    
  if(num==1)
  { 
     System.out.println("Number is happy");
  }
 else
  { 
     System.out.println("Number is not happy");
  }
  }
}