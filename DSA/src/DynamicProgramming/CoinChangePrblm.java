package DynamicProgramming;

//Write a program to find out the total number of ways to make change of given amount.
//For example, for N = 4 and S = {1,2,3}, there are four solutions: {1,1,1,1}, {1,1,2}, {2,2}, {1,3}.
//So output should be 4. [Infinite Supply of coins]

public class CoinChangePrblm {
	public static int balance(int n,int coins[]) {
		int size=coins.length;
		int dp[][] = new int[size+1][n+1];
		
		for(int i=0;i<n+1;i++) {
			dp[0][i]=0;
		}
		
		for(int i=0;i<size+1;i++) {
			dp[i][0]=1;
		}
		
		int i,j=0;
		for(i=1;i<size+1;i++) {
			for(j=1;j<n+1;j++) {
				
				if(j<coins[i-1]) {
					dp[i][j]=dp[i-1][j];
				}
				else {
					dp[i][j]=dp[i-1][j]+dp[i][j-coins[i-1]];
				}
				
			}
		}
		
		//for dp matrix visualization
		
//		for(int i=0;i<size+1;i++) {
//			for(int j=0;j<n+1;j++) {
//				System.out.print(dp[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		return dp[i-1][j-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=4;
		int coins[]= {1,2,3};
		System.out.println(balance(N,coins));
	}

}
