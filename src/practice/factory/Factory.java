package practice.factory;

public class Factory {

	public Vehicle objectFactory(String type) {
		if(type.equalsIgnoreCase("car")) {
			return new Car(); 
		}
		
		else if(type.equalsIgnoreCase("truck")) {
			return new Truck(); 
		}
		
		else if (type.equalsIgnoreCase("bike")) {
			return new Bike();
		}
		return null;
	}
}
