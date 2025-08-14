import java.util.Scanner;
class ReverseNoStore
{	
      public static void main(String []args)
      {
       int r,i,n, reverse=0 ;
       Scanner rv=new Scanner(System.in);
       System.out.println("Enter the no = ");
       n=rv.nextInt();
       
       while(n>0)
       {
            r=n % 10;
            reverse=reverse * 10 + r;
            n=n/10;
       }
       System.out.print("Reverse no is = " + reverse);
      }
}