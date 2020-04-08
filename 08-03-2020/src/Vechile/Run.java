package Vechile;

public class Run {

	public static void main(String[] args) {
		Car c1 = new Car("Nissan", 120, 4);
		Car c2 = new Car("Mazda", 140, 4);
		Airplane a1 = new Airplane("Jambo", 400);
		Vechicle [] v1= {c1,c2,a1};
		for (int i = 0; i < v1.length; i++) {
			System.out.println(v1[i]);
			v1[i].go();
		}
		System.out.println();
		

	}

}
