import java.util.*;
public class MCACheck
{
   public static void main(String args[])
   {
    int arr[]={1,2,3,4,1,2,3};
    HashMap<Integer,Integer> map=new HashMap<>();

   for(int i=0;i<arr.length;i++)
   {
       if(map.containsKey(arr[i]))
       {
          map.put(arr[i] , map.get(arr[i])+1);
       }
      else
       {
         map.put(arr[i],1);
       }
   }

    System.out.println(map.size());
    Set<Map.Entry<Integer,Integer>> set=map.entrySet();
    for(Map.Entry<Integer,Integer> m:set)
    {
     System.out.println(m.getKey()+"--->"+m.getValue());
    }
   }
}