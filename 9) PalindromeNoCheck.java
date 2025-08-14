import java.util.Scanner;
class PalindromeNoCheck
{	
      public static void main(String []args)
      {
       int r,n, reverse=0 ;
       Scanner rv=new Scanner(System.in);
       System.out.println("Enter the no = ");
       n=rv.nextInt();
       
       int z=n;
       while(n>0)
       {
            r=n % 10;
            reverse=reverse * 10 + r;
            n=n/10;
       }
       if(reverse == z)
       {
       System.out.print("The number is Palindrome");
       }
       else
       {
       System.out.print("The number is not Palindrome");
       }
      }
}