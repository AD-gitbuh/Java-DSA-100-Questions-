import java.util.*;

class AmstrongNo
{
     public static void main(String []args)
     {
      Scanner rv = new Scanner(System.in);
      System.out.println("Enter the no = ");
      
      int num = rv.nextInt();
      int count = num;
      int original = 0;
      int n=num;

      while(n > 0)
      {
        n = num % 10;
        n = Math.pow(n,3);
        Amstrong = Amstrong + num;
        n = n/10;
      }
      if(Amastrong == orignal)
      {
        System.out.println("No is amstrong");
      }
      else
      {
        System.out.println("No is not amstrong");
      }
    }
}
       
      