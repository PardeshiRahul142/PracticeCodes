class VarArgMethod
{
   int sum=0;
 
   void MarkSum(int ...x)
   {
     for(int i=0;i<x.length;i++)
     {
       sum=sum+x[i];
     }
   }

   public void show()
   {
     System.out.println("Total Marks is :"+sum);
   }
}

public class VariableArgumentAPP
{ 
   public static void main(String arga[])
   {
     VarArgMethod vm=new VarArgMethod();
                  vm.MarkSum(10,20,30,40,50);
                  vm.show();
   }
}