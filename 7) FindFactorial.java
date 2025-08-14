import java.util.Scanner;
class FindFactorial
{
      public static void main(String []args)
      {
             Scanner rv=new Scanner(System.in);
             System.out.print("Enter the number = ");
             int a=rv.nextInt();
             int sum=1;
             for(int i=1; i<=a; i++)
             {	 
                 sum=sum*i;
             }
             System.out.println("The factorial is = "+sum);
      }
}  
	