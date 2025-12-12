package practice.singleton;

public class SingletoneDemo {

	static SingletoneDemo obj=null;
	
	private SingletoneDemo() {
		
	}
	
	public synchronized static SingletoneDemo createObject() {
		if(obj==null) {
			obj=new SingletoneDemo();
			System.out.println("obect is created");
		}
		
		else {
			System.out.println("object is already crated");
		}
		return obj;
	}
}
