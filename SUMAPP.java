/*
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]*/

import java.util.*;
public class SUMAPP
{
  public static void main(String args[])
  {
   int nums[] ={3,1,2,10,1};
    int sum=0;
    for(int i=0;i<nums.length;i++)
    {
       sum+=nums[i];
      System.out.println(sum);
    }
   
  }//main
}//class