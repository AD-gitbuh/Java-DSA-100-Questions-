import java.util.Scanner;

class CountDigitsInNumber
{
      public static void main(String []args)
      {
        
       Scanner rv = new Scanner(System.in);
       System.out.println("Enter the number : ");
       int n = rv.nextInt();
       
       int count = 0;
       
       while(n > 0) 
       {
           n = n / 10;
           count++;
       }
        System.out.print("Digits in a number is : " + count);
      }
}
          