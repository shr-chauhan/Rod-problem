
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RodByDP
{
	public static int rodDP(int n, int[] p)
	{
		int dp[]=new int[n+1];
		for(int j=0;j<=n;j++)
		dp[j]=0;
		int ans = 0;
		if(n == 0)
		return 0;
		else{
		for(int j=1 ;j<=n;j++)
		{
			for(int i = 1;i<=j;i++ )
			{
			ans = Math.max(ans, p[i] + dp[j-i]);
			dp[j]=ans;
			}}
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
		
		System.out.println(rodDP(n,a));
		
	}
}