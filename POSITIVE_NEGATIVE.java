import java.util.*;
import java.lang.*;
import java.io.*;

class pos_neg
{
	public static void main (String[] args) throws java.lang.Exception
	{
 int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        n = s.nextInt();
        if(n > 0)
        {
            System.out.println("The given number "+n+" is POSITIVE");
        }
        else if(n < 0)
        {
            System.out.println("The given number "+n+" is NEGATIVE");
        }
        else
        {
            System.out.println("The given number "+n+" is neither Positive nor Negative ");
        }
    }
}