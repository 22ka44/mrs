import java.util.Scanner;

public class leap_yr_or_not
{
    public static void main(String args[])
    {
       int yr;
       Scanner scan = new Scanner(System.in);
	   
       System.out.print("Enter Year : ");
       yr = scan.nextInt();
	   
       if((yr%4 == 0)
       {
           System.out.print("This is a Leap Year");
       }
      
       else
       {
           System.out.print("This is not a Leap Year");
       }
    }
}