import java.util.Scanner;

class Ascii
{
     public static void main(String []args)
     {
      Scanner rv = new Scanner(System.in);
      System.out.println("Enter the value : ");     
      char ch = rv.next().charAt(0);
      
      int ascii = (int) ch;
      
      if((ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122))
      {
       System.out.println(" ASCII value is : " + ascii );
      }
      else
      {
       System.out.println("The value is incorrect ");
      }
     }
}