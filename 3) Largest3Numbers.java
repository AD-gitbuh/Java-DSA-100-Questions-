import java.util.Scanner;
class Largest3Numbers
{
      public static void main(String []args)
      {
        Scanner rv = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = rv.nextInt();

        System.out.println("Enter the second number : ");
        int b = rv.nextInt();

        System.out.println("Enter the third number : ");
        int c = rv.nextInt();

        if(a>b && a>c)
        { 
         System.out.print("a is the largest no = " + a);
        }
        else if(b>a && b>c)
        { 
         System.out.print("b is the largest no = " + b);
        }
        else
        { 
         System.out.print("c is the largest no = " + c);
        }
       }
}