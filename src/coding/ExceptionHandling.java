package coding;

public class ExceptionHandling {

	public void checkException(int num) {
		try {
			int count=10/num;
			System.out.println(count);
			System.exit(0);
		}
		
		catch(ArithmeticException e) {
			System.out.println("can't divide by zero");
			
		}
		
		finally {
			System.out.println("finally always exicuted");
		}
	}
	
	public static void main (String [] arg) {
		ExceptionHandling e1 = new ExceptionHandling();
		e1.checkException(2);
	}
}
