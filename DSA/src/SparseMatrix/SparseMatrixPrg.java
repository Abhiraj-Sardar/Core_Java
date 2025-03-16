package SparseMatrix;

public class SparseMatrixPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] sparse = {
				{0,0,3,0,4},
				{0,0,5,7,0},
				{0,0,0,0,0},
				{0,2,6,0,0},
		};
		
		int size=0;
		
		System.out.println("Sparse Matrix\n");
		
		// printing the sparse matrix
		for(int i=0;i<sparse.length;i++) {
			for(int j=0;j<sparse[i].length;j++) {
				System.out.print(sparse[i][j]+" ");
				if(sparse[i][j]!=0) {
					size+=1; //no of non-zero element
				}
			}
			System.out.println();
		}
		
		// create a Compressed Matrix
		
		int [][] compress = new int[size][3];
		int k=0;
		for(int i=0;i<sparse.length;i++) {
			for(int j=0;j<sparse[i].length;j++) {
				if(sparse[i][j]!=0) { 
					compress[k][0]=i; //row
					compress[k][1]=j; //column
					compress[k][2]=sparse[i][j]; //non - zero element
					k++;
				}
			}
			
		}
		
		System.out.println();
		
		//display the compressed matrix
		
		System.out.println("Row \tCol \tNon-zero Element");
		for(int i=0;i<size;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(compress[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		// transpose matrix
		int transpose[][]=new int[sparse[0].length][sparse.length];
		
		for(int i=0;i<size;i++) {
			transpose[compress[i][1]][compress[i][0]]=compress[i][2];
		}
		
		//display transpose matrix
		System.out.println("\nTranspose of the sparse matrix\n");
		for(int i=0;i<transpose.length;i++) {
			for(int j=0;j<transpose[0].length;j++)
			{
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
			
	}

}
