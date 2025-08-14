import java.util.Scanner;
class SumDigitsOfNo
{
     public static void main(String []args)
     {
      Scanner rv = new Scanner(System.in);
      System.out.println("Enter the number : ");
      int n = rv.nextInt();
      int r;
      int sum = 0;
   
      while(n > 0)
      {
        r = n % 10;
        sum = sum + r;
        n = n / 10;
      }
       System.out.print("Sum of the number is = " + sum);
      }
}
