package practice;

public class VehicleFactroy {

	public Vehicle createObject(String type) {
		if(type.equalsIgnoreCase("truck")) {
			return new Truck();
		}
		else if(type.equalsIgnoreCase("car")) {
			return new Car();
		}
		
		else if(type.equalsIgnoreCase("bike")){
			return  new Bike();
			}
		return null;
	}
}
