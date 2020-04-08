package Vechile;

public class Car extends Vechicle {
private int wheels;


	public Car(String model, int speed, int wheels) {
	super(model, speed);
	this.wheels = wheels;
}


	@Override
	public String toString() {
		return "Car [wheels=" + wheels + ", getModel()=" + getModel() + ", getSpeed()=" + getSpeed() + "]";
	}


	public int getWheels() {
		return wheels;
	}


	public void setWheels(int wheels) {
		this.wheels = wheels;
	}


	@Override
	public void go() {
		System.out.println("drivinig in a car");
	}

}
