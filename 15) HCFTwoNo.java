import java.util.*;

class HCFTwoNo
{
     public static void main(String []args)
     {
      Scanner rv = new Scanner(System.in);
      System.out.print("Enter the First number : ");
      int a = rv.nextInt();

      System.out.print("Enter the second number : ");
      int b = rv.nextInt();

      
      int hcf = 1;
      int min =Math.min(a,b);

      for(int i = 1; i<=min; i++ )
      {
         if(a % i == 0 && b % i == 0)
         {   
              hcf = i;
         }        
      }
       System.out.print("The HCF is = " + hcf);
      }
}