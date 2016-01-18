
import java.util.*;
import java.lang.*;
import java.io.*;


class RodByMemoization
{
	public static int rodMemoization(int n, int[] p, int[] memo)
	{
		int ans = -10;
		if(memo[n]!=-1)
		   return memo[n];
		if(n == 0)
		   return 0;
		else{
			for(int i = 1;i<=n;i++ )
			{
			ans = Math.max(ans, p[i] + rodMemoization(n-i,p,memo));
			}
		  memo[n]=ans;
		  return ans;
		}
		
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int memo[]=new int[n+1];
		for(int j=0;j<=n;j++)
		   memo[j]=-1;
		int a[] = new int[n+1];
		for(int i = 0 ; i< n+1 ; i++)
		   a[i] = in.nextInt();
		System.out.println(rodMemoization(n,a,memo));	
	}
}