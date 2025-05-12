package DynamicProgramming;

import java.util.Arrays;

//Given a set of non-negative integers, and a value sum, Write a program to determine if there is a
//subset of the given set with sum equal to given sum. Input: set [] = {3, 34, 4, 12, 5, 2}, sum = 9
//Output: True [ There is a subset (4, 5) with sum 9]

public class SubsetSum {
	
	public static int findSubset(int set[],int sum) {
		int n=set.length;
		int dp[][] = new int[n+1][sum+1];
		
		for(int i=0;i<sum+1;i++) {
			dp[0][i]=0;
		}
		
		for(int i=0;i<n+1;i++) {
			dp[i][0]=1;
		}
		
		int i,j=0;
		for(i=1;i<n+1;i++) {
			for(j=1;j<sum+1;j++) {
				
				if(j<set[i-1]) {
					dp[i][j]=dp[i-1][j];
				}
				else {
					dp[i][j]=dp[i-1][j]+dp[i-1][j-set[i-1]];
				}
				
			}
		}
		
		//for dp matrix visualization
		
//		for(int a=0;a<n+1;a++) {
//			for(int b=0;b<sum+1;b++) {
//				System.out.print(dp[a][b]+" ");
//			}
//			System.out.println();
//		}
		
		return dp[i-1][j-1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int set [] = {3, 34, 4, 12, 5, 2};
		int sum=9;
		
		Arrays.sort(set);
		
		if(findSubset(set,sum)>0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
//		System.out.println(Arrays.toString(set));
	}

}
