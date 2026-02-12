import java.util.*;
import java.util.Date;


public  class OBJEARRAY
{
  public static void main(String args[])
  {
     Object obj[]=new Object[4];
     obj[0]="Rahul";
     obj[2]=1;
     obj[3]=new Date();

     for(Object o:obj)
     {
        System.out.println(o);
     } 
  } 
}