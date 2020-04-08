package FernitureFactor;

public class Bed extends Ferniture {

	private boolean IsitDouble;

	public Bed() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bed(int longg, int whide, int high, String color, boolean isitDouble) {
		super(longg, whide, high, color);
		IsitDouble = isitDouble;
	}

	public boolean isIsitDouble() {
		return IsitDouble;
	}

	public void setIsitDouble(boolean isitDouble) {
		IsitDouble = isitDouble;
	}

	@Override
	public String toString() {
		return "Bed [IsitDouble=" + IsitDouble + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void display() {
		System.out.println(toString());

	}

	@Override
	public void draw() {
		System.out.println("   ||");
		System.out.println("   ||                   ||");
		System.out.println("||/||___                ||");
		System.out.println("|| /`   )____________||_/|");
		System.out.println("||/___ //_/_/_/_/_/_/||/ |");
		System.out.println("||(___)/_/_/_/_/_/_/_||  |");
		System.out.println("||     |_|_|_|_|_|_|_|| /|");
		System.out.println("||     | | | | | | | ||/||");
		System.out.println("||~~~~~~~~~~~~~~~~~~~||");
		System.out.println("||                   ||");

	}

}
