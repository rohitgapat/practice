package practice.factory;

public abstract class Vehicle {

	public void start() {
		System.out.println("vehicale is starting");
	}
	public abstract void vehicleType();
}

class Car extends Vehicle{
	public void vehicleType() {
		System.out.println("car running on four wheel");
	}
}

class Truck extends Vehicle{
	public void vehicleType() {
		System.out.println("truck running with heavy load");
	}
}

class Bike extends Vehicle{
	public void vehicleType() {
		System.out.println("bike running with two wneel");
	}
}