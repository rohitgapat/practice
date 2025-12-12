package java8feature;

public class Print{
	
	public static void main (String[] arg) {
		Functional f1= () -> System.out.println("hello");
		f1.print();
	}
}