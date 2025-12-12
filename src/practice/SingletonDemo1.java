package practice;

public class SingletonDemo1 {

	private static SingletonDemo1 object;
	
	private SingletonDemo1() {
		
	}
	
	public static synchronized SingletonDemo1 createObject() {
		if(object==null) {
			object= new SingletonDemo1();
			System.out.println("object is created");
			return object;
		}
		
		else {
			System.out.println("objec is already created");
		}
		
		return null;
	}
}
