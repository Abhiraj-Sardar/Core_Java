package Graph;

public class Prims_Algorithm {
	public static void prims(int mat[][]) {
		int size=mat.length;
		int visited[] = {0,0,0,0,0};
		visited[0]=1;
		int mini=100000000;
		int sum=0,loc=0,n=1;
		
		while(n!=5) {
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				
				if(visited[j]==1) continue;
				
				if(visited[i]==1 && mat[i][j]!=0 && mat[i][j]<mini) {
					mini=mat[i][j];
					loc=j;
				}
			}
			
		}
		
		System.out.println(mini);
		visited[loc]=1;
		sum=sum+mini;
		n+=1;
		mini=100000000;
	}
		
		System.out.println("Shortest Weight: "+sum);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = {{0,9,75,0,0},
					   {9,0,95,19,42},
					   {75,95,0,51,66},
					   {0,19,51,0,31},
					   {0,42,66,31,0}};
		prims(mat);
	}

}
