package Exception;

class MyException extends Exception{
	
	public String toString(){ //overriding object class toString()
		return "Abhiraj Sardar's Exception";
	}
}

public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new MyException();
		}catch(MyException e) {
			System.out.println(e);
		}
	}

}
