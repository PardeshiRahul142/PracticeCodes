import java.util.*;
public class CONCATARRAY
{
  public static void main(String  args[])
  {
     int nums[]={10,20,30};
     int size=nums.length;
     int ans[]=new int[size*2];

    for(int i=0;i<nums.length;i++)
    {
        ans[i]=nums[i];
        ans[size+i]=nums[i];
    }

    for(int i=0;i<ans.length;i++)
    {
      System.out.println(ans[i]);
    }
  }
}