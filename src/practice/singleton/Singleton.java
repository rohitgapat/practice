package practice.singleton;

public class Singleton {

	private static Singleton object;
	
	private Singleton () {}
	
	public synchronized static Singleton checkObjectIsCreate() {
		if(object==null) {
			object = new Singleton();
			System.out.println("object is created");
			return object;
		}
		
		else {
			System.out.println("class have already one object");
		}
		return object;
	}
}
