/*
Q21.  Write a java program to check Number Is Prime Number or Not.
Example : A prime number is a number that can only be divided by itself and 1 without remainders.The prime numbers from 1 to 100 are: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.
*/

import java.util.*;
public class PRIMEAPP
{
  public static void main(String argsp[])
  {

    for(int i=2;i<=100;i++)
    {
        boolean flag=true;
       for(int j=2;j<=i/2;j++)
       {
         if(i % j ==0)
         {
           flag=false;
           break;
         }
       }

      if(flag)
      {
        System.out.print(" "+i);
      }
    }
  }
}