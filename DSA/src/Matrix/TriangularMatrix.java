package Matrix;

class CheckTriangular{
	
	public static boolean isLowerTriangular(int arr[][]) {
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i>=j){
					if(arr[i][j]==0) {
						return false;
					}
				}
				else {
					if(arr[i][j]!=0) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public static boolean isUpperTriangular(int arr[][]) {
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i<=j){
					if(arr[i][j]==0) {
						return false;
					}
				}
				else {
					if(arr[i][j]!=0) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public static boolean isDiagonal(int arr[][]) {
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j){
					if(arr[i][j]==0) {
						return false;
					}
				}
				else {
					if(arr[i][j]!=0) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public static boolean isIdentity(int arr[][]) {
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j){
					if(arr[i][j]!=1) {
						return false;
					}
				}
				else {
					if(arr[i][j]!=0) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public static boolean isTriDiagonal(int arr[][]) {
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(((int)Math.abs(i-j))<=1){
					if(arr[i][j]==0) {
						return false;
					}
				}
				else {
					if(arr[i][j]!=0) {
						return false;
					}
				}
			}
		}
		return true;
	}
}

public class TriangularMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int LTMatrix[][]={ { 2, 0, 0 }, 
					  { 1, 2, 0 }, 
					  { 3, 6, 2 } 
					};
		
		int UTMatrix[][]={ 
				  { 2, 1, 3 }, 
				  { 0, 2, 1 }, 
				  { 0, 0, 2 } 
				};
		
		int diagonalMatrix[][]={ 
				  { 2, 0, 0 }, 
				  { 0, 2, 0 }, 
				  { 0, 0, 2 } 
				};
		
		int identityMatrix[][]={ 
				  { 1, 0, 0 }, 
				  { 0, 1, 0 }, 
				  { 0, 0, 1 } 
				};
		
		int triDiagonalMatrix[][]={ 
				  { 1, 2, 0, 0}, 
				  { 2, 1, 1, 0}, 
				  { 0, 3, 1, 2},
				  { 0, 0, 1, 4}
				};
		
		System.out.println(CheckTriangular.isLowerTriangular(LTMatrix));
		System.out.println(CheckTriangular.isUpperTriangular(UTMatrix));
		System.out.println(CheckTriangular.isDiagonal(diagonalMatrix));
		System.out.println(CheckTriangular.isIdentity(identityMatrix));
		System.out.println(CheckTriangular.isTriDiagonal(triDiagonalMatrix));
		
	}

}
