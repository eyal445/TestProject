package FernitureFactor;

public class Chair extends Ferniture {

	private int legs;

	public Chair() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Chair(int longg, int whide, int high, String color, int legs) {
		super(longg, whide, high, color);
		this.legs = legs;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	@Override
	public String toString() {
		return "Chair [legs=" + legs + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void display() {
		System.out.println(toString());

	}

	@Override
	public void draw() {
		System.out.println("  i______i");
		System.out.println("  I______I");
		System.out.println("  I      I");
		System.out.println("  I______I");
		System.out.println(" /      /I");
		System.out.println("(______( I");
		System.out.println("I I    I I");
		System.out.println("I      I");

	}
}
