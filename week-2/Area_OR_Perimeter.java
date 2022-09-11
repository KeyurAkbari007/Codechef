	/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Area_OR_Perimeter
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int L=sc.nextInt();
		int B=sc.nextInt();
		if((L*B)>(2*(L+B)))
		{
                System.out.println("Area");
                System.out.println(L*B);
		    
		}
		    else if((L*B)<(2*(L+B)))
		{
                System.out.println("Peri");
                System.out.println(2*(L+B));
		    
		}
		else{
		         System.out.println("Eq");
                System.out.println(2*(L+B));
		}
	}
}
