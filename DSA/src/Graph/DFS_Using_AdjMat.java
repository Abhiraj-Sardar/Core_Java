package Graph;

public class DFS_Using_AdjMat {
	public static void dfsTraversal(int mat[][]) {
		int visited[] = {0,0,0,0,0};
		int stack[] = new int[5];
		int top=0,start=0,i=0;
		visited[0]=1;
		System.out.print((char)(start+65));
		stack[top]=0;
		while(top!=-1) {
			start=stack[top];
			for(i=0;i<5;i++) {
				if(mat[start][i]==1 && visited[i]!=1) {
					top=top+1;
					stack[top]=i;
					System.out.print((char)(i+65));
					visited[i]=1;
					break;
				}
			}
			
			if(i==5) {
				top--;
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = {{0,1,0,0,1},
					   {1,0,1,1,0},
					   {0,1,0,0,0},
					   {0,1,0,0,0},
					   {1,0,0,0,0}};
		
		dfsTraversal(mat);
	}

}
