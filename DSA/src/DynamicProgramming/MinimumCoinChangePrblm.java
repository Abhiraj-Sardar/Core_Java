package DynamicProgramming;

//7. Write a program to find out the minimum no of coins to make change of given amount
//For example, for N = 10 and S = {1,5,6,9}, there are two solutions: {5,5},{1,9} So output should
//be 2. [Infinite Supply of coins]

public class MinimumCoinChangePrblm {
	public static int findMinimum(int s[],int target) {
		int size=s.length;
		int dp[][] = new int[size+1][target+1];
		
		for(int i=0;i<target+1;i++) {
			dp[0][i]=0;
		}
		
		for(int i=0;i<size+1;i++) {
			dp[i][0]=0;
		}
		
		int i,j=0;
		
		for(i=1;i<size+1;i++) {
			for(j=1;j<target+1;j++) {
				
				if(s[i-1]==1) {
					dp[i][j]=j;
				}
				else if(j<s[i-1]) {
					dp[i][j]=dp[i-1][j];
				}
				else {
					dp[i][j]=Math.min(dp[i-1][j],dp[i][j-s[i-1]]+1);
				}
			}
		}
		
		//for dp matrix visualization
		
//		for(int a=0;a<size+1;a++) {
//			for(int b=0;b<target+1;b++) {
//				System.out.print(dp[a][b]+" ");
//			}
//			System.out.println();
//		}
		
		return dp[i-1][j-1];
	}
	public static void main(String[] args) {
		
		int n=10;
		int s[]= {1,5,6,9};
		int ans=findMinimum(s,n);
		System.out.println(ans);
	}

}
