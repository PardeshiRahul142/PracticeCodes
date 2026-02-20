import java.util.*;
public class TAPP
{
  public static void main(String args[])
  {
    Thread th=new Thread(()->{
    
     try{
     
          for(int i=0;i<5;i++)
          {
            System.out.println(i);
          }
       }
     catch(Exception e)
     {
       System.out.println(e);
     }
  });
  th.start();
  }
}