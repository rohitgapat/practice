package practice;

public class VehicleFactoryMain {

	public static void main(String [] arg) {
		VehicleFactroy v1 = new VehicleFactroy();
		Vehicle v = v1.createObject("car");
		v.start();
	}
}
