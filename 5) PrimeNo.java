import java.util.Scanner;
class PrimeNo
{
      public static void main(String []args)
      {
        int n,i,count=0;
       Scanner rv=new Scanner(System.in);  
       System.out.println("Enter the no: ");  
       n=rv.nextInt();
       for(i=1; i<=n; i++)
       {
            if(n%i==0)
            { 
               count++;
            }
       }
        if(count==2)
        { 
        System.out.print("The number is a Prime no");  
        }
        else
        {
        System.out.print("The number is not a Prime no");
        }
     }
}


