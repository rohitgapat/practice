package practice.factory;

public class MainClass  {

	public static void main(String arg[]) {
		Factory f1= new Factory();
		Vehicle v=f1.objectFactory("truck");
		v.start();
		v.vehicleType();
	}
}
 