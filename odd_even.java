import java.util.Scanner;
 
class odd_even
{
   public static void main(String args[])
   {
      int n;
      System.out.println("Enter the number");
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
 
      if ( n % 2 == 0 )
         System.out.println("Entered number is even");
      else
         System.out.println("Entered number is odd");
   }
}