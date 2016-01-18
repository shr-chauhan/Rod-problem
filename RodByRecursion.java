import java.util.*;
import java.lang.*;
import java.io.*;

class RodByRecursion
{
	public static int rodRecursion(int n, int[] p)
	{
		int ans = 0;
		if(n == 0)
		return 0;
		else{
			for(int i = 1;i<=n;i++ )
			ans = Math.max(ans, p[i] + rodRecursion(n-i,p));
		return ans;
		}	
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int a[] = new int[n+1];
		for(int i = 0 ; i< n+1 ; i++)
		a[i] = in.nextInt();
		System.out.println(rodRecursion(n,a));	
	}
}