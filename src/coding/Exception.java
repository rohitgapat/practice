package coding;

public class Exception {

	public void checkExceptin() {
		int num=20;
		
		try {
			int res = num/0;
			System.out.println(res);
		}
		
		catch(ArithmeticException e) {
			System.out.println("Error: Division by zero is not allowed.");
		}
		
		finally {
			System.out.println("Exception handeled");
		}
		
		try {
			handleException();
		}
		
		catch (ArithmeticException e) {
			System.out.println("Error division by zero");
		}
	}
	
	public void handleException() throws   ArithmeticException {
		
		int num= 10/2;
		System.out.println(num);
	}
	
	public static void main (String [] arg) {
		Exception e1= new Exception();
		e1.checkExceptin();
	}
}
