import java.util.*;
class Company
{
  private int c_Id;
  private String c_Name;
  private String prod_Name;
  private double p_Price;

  public void setcId(int c_Id){this.c_Id=c_Id;}
  public void setcName(String cName){this.c_Name=cName;}  
  public void setprodName(String p_Name){this.prod_Name=p_Name;}
  public void setprodPrice(double p_Price){this.p_Price=p_Price;}

  public int getcId(){return c_Id;}
  public String getcName(){return c_Name;}
  public String getprodName(){return prod_Name;}
  public double getpPrice(){return p_Price;}
}
class CompDetail
{
   public void display(Company comp[])
   {
     for(int i=0;i<comp.length;i++)
     {
       System.out.println("company  id :"+comp[i].getcId() + "  "+
                          "company name :"+comp[i].getcName()+" "+
                          "product name :"+comp[i].getprodName()+" "+
                          "product price :"+comp[i].getpPrice());
     }
      
   }
}
public class CAPP
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    
   Company c[]=new Company[2];
  
   for(int i=0;i<c.length;i++)
   { 
     c[i]=new Company();
    System.out.println("-----------------------------------------------------------------------");
    System.out.println("Enter company no :"+(i+1));
     System.out.println("Enter company id :"); 
     int cId=sc.nextInt();
     sc.nextLine();

     System.out.println("Enter the company name:");
     String cName=sc.nextLine();

     System.out.println("Enter the product name");
     String prodName=sc.nextLine();

     System.out.println("Enter the product price");
     double price=sc.nextDouble();

     c[i].setcId(cId);
     c[i].setcName(cName);
     c[i].setprodName(prodName);
     c[i].setprodPrice(price);
 
   
   }
   CompDetail cd=new CompDetail();
    cd.display(c);
    
  }
}