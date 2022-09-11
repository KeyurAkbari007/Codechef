/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Summer_Heat
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T,xa,xb,Xa,Xb;
		T=sc.nextInt();
		for(int i=0;i<T;i++)
		{
		    xa=sc.nextInt();
		    xb=sc.nextInt();
		    Xa=sc.nextInt();
		    Xb=sc.nextInt();
		    System.out.println((Xa/xa)+(Xb/xb));
		}
	}
}
