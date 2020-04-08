package FernitureFactor;

public abstract class Ferniture {
	private int longg;
	private int whide;
	private int high;
	private String color;

	public Ferniture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ferniture(int longg, int whide, int high, String color) {
		this.longg = longg;
		this.whide = whide;
		this.high = high;
		this.color = color;
	}

	public int getLongg() {
		return longg;
	}

	public void setLongg(int longg) {
		this.longg = longg;
	}

	public int getWhide() {
		return whide;
	}

	public void setWhide(int whide) {
		this.whide = whide;
	}

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Ferniture [longg=" + longg + ", whide=" + whide + ", high=" + high + ", color=" + color + "]";
	}

	public abstract void display();

	public abstract void draw();

}
