package FernitureFactor;

public class Table extends Ferniture {
	private int sits;

	public Table() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Table(int longg, int whide, int high, String color, int sits) {
		super(longg, whide, high, color);
		this.sits = sits;
	}

	public int getSits() {
		return sits;
	}

	public void setSits(int sits) {
		this.sits = sits;
	}

	@Override
	public String toString() {
		return "Table [sits=" + sits + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void display() {
		System.out.println(toString());

	}

	@Override
	public void draw() {
		System.out.println("   =====================");
		System.out.println("  /                   /");
		System.out.println(" /                   /|");
		System.out.println("===================== |");
		System.out.println(" | |               |  |");
		System.out.println(" | |               |  |");
		System.out.println(" | |               |  |");
		System.out.println(" |                 |");
		System.out.println(" |                 |");
		System.out.println(" |                 |");

	}
}
