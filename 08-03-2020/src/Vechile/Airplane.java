package Vechile;

public class Airplane extends Vechicle {

	public Airplane(String model, int speed) {
		super(model, speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Airplane [getModel()=" + getModel() + ", getSpeed()=" + getSpeed() + "]";
	}

	@Override
	public void go() {
		System.out.println("flying like an airplane");

	}

}
