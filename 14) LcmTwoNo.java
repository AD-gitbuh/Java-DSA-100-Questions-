import java.util.Scanner;

class LcmTwoNo
{
      public static void main(String []args)
      {
       Scanner rv = new Scanner(System.in);
       System.out.println("Enter the First no : ");
       int a = rv.nextInt();

       System.out.println("Enter the Second no : ");
       int b = rv.nextInt();
 
       int lcm = Math.max(a,b);

       while(true)
       {
         if(lcm % a == 0 && lcm % b == 0)
         {
          System.out.println("The lcm is : " + lcm);
          break;
         }
          lcm++;
        }
      }
}