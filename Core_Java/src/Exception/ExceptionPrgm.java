package Exception;

public class ExceptionPrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int d=100/0;
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
	}

}
