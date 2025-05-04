package Graph;
public class BFS_Using_AdjMat {
	public static void bfsTraversal(int mat[][]) {
		int visited[] = {0,0,0,0,0};
		int queue[] = new int[5];
		int front=0,rear=0;
		queue[rear]=1;
		visited[rear]=1;
		rear+=1;
		System.out.print((char)(0+65));
		while(front<5) {
			
			for(int i=0;i<5;i++) {
				if(mat[front][i]==1 && visited[i]!=1) {
					System.out.print((char)(i+65));
					queue[rear]=mat[front][i];
					visited[i]=1;
					rear+=1;
				}
				
			}
			front+=1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mat[][] = {{0,1,0,0,1},
					   {1,0,1,1,0},
					   {0,1,0,0,0},
					   {0,1,0,0,0},
					   {1,0,0,0,0}};
		
		bfsTraversal(mat);
	}
}

