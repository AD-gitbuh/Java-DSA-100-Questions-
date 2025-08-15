import java.util.Scanner;
class GcdTwoNumber
{
      public static void main(String []args)
      {
             Scanner rv=new Scanner(System.in);
             System.out.print("Enter the number a = ");
             int a=rv.nextInt();
             System.out.print("Enter the number b = ");
             int b=rv.nextInt();
     
             int gcd=1;
             int min=Math.min(a, b);
             
             for(int i=1; i<=min; i++)
             {	 
                if(a%i==0 && b%i==0)
                 {
                   gcd=i;
                 }
             }
              System.out.println("gcd = " +gcd);
      }
}  
