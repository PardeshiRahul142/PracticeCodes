/*
Input: arr = [4,3,1,1,3,3,2], k = 3
Output: 2
Explanation: Remove 4, 2 and either one of the two 1s or three 3s. 1 and 3 will be left.
 
*/

import java.util.*;
public class FCAPP
{
  public static void main(String agrs[])
  {
      int arr[]={4,3,1,1,3,3,2};
      int k = 3;

      HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

        for(int v:arr)
        {
            map.put(v,map.getOrDefault(v,0)+1);
        }
      
       Set<Map.Entry<Integer,Integer>>set=map.entrySet();
    
     /*
      for(Map.Entry<Integer,Integer>m:set)
     {
        System.out.println(m.getKey()+"--->"+m.getValue());
      }
     */
   
      ArrayList<Integer> freq=new ArrayList<>();
   
     for(int v:map.values())
     {
        freq.add(v);
     }

     Collections.sort(freq);

    int uniques=freq.size();

    for(int f:freq)
    {
     if(k>=f)
     { 
       k-=f;
      uniques--;
     }
    else
     {
        break;
     } 
    }

     System.out.println("unique elements left :"+uniques); 
  }
}