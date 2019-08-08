package assign2_4;

import java.util.Scanner;

public class assign2_4 {

	

	   public static void main(String[] args)

	{
	   int i,n,sum=0;

	   System.out.print("Input number of terms is: ");
	{
	   Scanner scan = new Scanner(System.in);
			    n = scan.nextInt();
	  System.out.println ("\nThe odd numbers are :");
	   for(i=1;i<=n;i++)

	   {
	     System.out.println (2*i-1);
	     sum+=2*i-1;
	   }
	   System.out.println ("The Sum of odd Natural Number upto " +n+" terms is: " +sum);
	   
	   scan.close();
	}
	}
	}
