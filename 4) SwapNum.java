import java.util.*;
class SwapNum
{
      public static void main(String []args)
      {
             
             Scanner rv=new Scanner(System.in);
             System.out.println("Enter the first value = ");
             int a=rv.nextInt();
             System.out.println("Enter the second value = ");
             int b=rv.nextInt();
             int c=a;
             a=b;
             b=c;
             System.out.println("first value is=" +a );
             System.out.println("second value is=" +b );
       }
}