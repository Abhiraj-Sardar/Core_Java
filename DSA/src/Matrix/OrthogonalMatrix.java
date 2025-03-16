package Matrix;


public class OrthogonalMatrix {
	
	public static int[][] getTranspose(int arr[][]) {
		int n=arr.length;
		int arrT[][] = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arrT[i][j]=arr[j][i];
			}
		}
		return arrT;
	}
	
	public static void display(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static int[][] matrixMultiply(int arr[][], int arrT[][]) {
		int n=arr.length;
		int ans[][]= new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){ 
				ans[i][j]=0;
				for(int k=0;k<n;k++) {
					ans[i][j]+=arr[i][k]*arrT[k][j];
				}
			}
		}
		return ans;
	}
	
	public static boolean checkIdentityEquivalence(int arr[][]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					if(arr[i][j]!=1) {
						return false;
					}
				}else {
					if(arr[i][j]!=0) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public static boolean isOrthogonal(int mat[][]) {
		
		System.out.println("The Matrix");
		display(mat);
		int matT[][]=getTranspose(mat);
		
		System.out.println("The Transpose Matrix");
		display(matT);
		int prodMat[][] = matrixMultiply(mat,matT);
		
		System.out.println("The Product Matrix of Matrix and it's Transpose");
		display(prodMat);
		return checkIdentityEquivalence(prodMat);
	}
	
	public static int oneNorm(int arr[][]) {
		int n=arr.length;
		int norm=0;
		for(int i=0;i<n;i++) {
			int ans=0;
			for(int j=0;j<n;j++) {
				ans=ans+arr[j][i];
			}
			norm=Math.max(norm, ans);
		}
		return norm;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][]= {
				{1,0},
				{0,1}
		};
		
		if(isOrthogonal(mat)) {
			System.out.println("It's an Orthogonal Matrix");
			System.out.println("1-norm of the matrix is: "+oneNorm(mat));
		}else {
			System.out.println("It's not an Orthogonal Matrix");
		}
	}

}
