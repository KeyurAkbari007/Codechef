/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	        Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        while(t-->0)
	        {
    	        int N=sc.nextInt();
    	        int l=sc.nextInt();
    	        int x=sc.nextInt();
    	        if(N==0 || l==0 ||x==0)
    	        {
    	            System.out.println(0);
    	        }
    	        else{
    	             System.out.println((Math.min(l,N-l)*x));;
    	        }
	       }
	}
}
