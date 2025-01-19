package Exception;

public class TryWithoutCatchPrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int d=100/0;
		}finally {
			System.out.println("This will always get printed either exception occurs or not");
		}
	}

}
