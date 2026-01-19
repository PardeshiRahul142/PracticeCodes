/*Q2. Problem:
 Create a custom exception class InvalidAgeException.
 Write a program to accept a person’s age and throw this exception if the age is less than 18.
 Display an appropriate message when the exception occurs.*/

import java.util.*;
class Customer extends RuntimeException
{ 
  int age;
  public Customer(int age)
  {
     this.age=age;
  }

  public String toString()
  {
     return "Person is age is valid";
  }
}
class CheckValid
{
   public void check(int age)
   {
       if(age>=18)
       {
            Customer c=new Customer(age);
            throw c;
       }
      else
       {
           System.out.println("Invalid age...");
       }
   }
}
public class CheckAge
{
  public static void main(String args[])
  {
   CheckValid va=new CheckValid();
 
    try
    {
        va.check(10);   
    }
   catch(Customer c)
   { 
      System.out.println(c.toString());

   }

  }
}