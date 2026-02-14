/*
Example
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
*/

import java.util.*;
public class Sum
{
  public static void main(String args[])
  { 
     int nums[]={2,7,11,15};
    int t=9;
     int sum=0;
      boolean flag=false;
     for(int i=0;i<nums.length;i++)
     {
        sum+=nums[i];

       if(sum==t)
       {
        System.out.print("["+(i-1)+","+i+"]");
         flag=true;
          break;
       }
     }
   
  }
}