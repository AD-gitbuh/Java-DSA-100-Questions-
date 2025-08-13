import java.util.Scanner;
class FibonacciImproved
{
      public static void main(String []args)
      {
             int a=0 ,b=1 ,n,c;
             Scanner rv=new Scanner(System.in);
             System.out.println("Enter how many terms you want:" );
             n=rv.nextInt();
             System.out.print(a+" "+b+" ");

             for(int i=3; i<=n; i++)
             {
              c=a+b;
              a=b;
              b=c;
              System.out.print(c+" ");
             }
       }
}