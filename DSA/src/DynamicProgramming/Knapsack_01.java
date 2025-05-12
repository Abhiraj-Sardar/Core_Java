package DynamicProgramming;

public class Knapsack_01 {
	
	//incomplete
	public static int knapsack(int weight[],int profit[],int n,int w) {
		
		int dp[][] = new int[n+1][w+1];
		int loci=0,locj=0;
		//initializing 1st row with 0
		for(int i=0;i<w+1;i++) {
			dp[0][i]=0;
		}
		
		//initializing 1st column with 0
		for(int i=0;i<n+1;i++) {
			dp[i][0]=0;
		}
		
		for(int i=1;i<(n+1);i++) {
			for(int j=1;j<(w+1);j++) {
				
				if(weight[i-1]<j) {
					dp[i][j]=dp[i-1][j];
				}
				else {
					dp[i][j]=Math.max(dp[i-1][j],profit[i-1]+dp[i-1][j-weight[i-1]]);
					System.out.println(dp[i][j]);
				}
				locj=j;
				
			}
			loci=i;
			System.out.println("i"+loci);
		}
		
		
		return dp[loci][locj];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int weight[] = {3,4,5,6};
		int profit[]= {2,3,4,1};
		int w=8;
		int n=4;
		int ans=knapsack(weight,profit,n,w);
		System.out.println(ans);
	}

}
