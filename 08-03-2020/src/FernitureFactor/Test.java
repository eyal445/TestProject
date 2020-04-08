package FernitureFactor;

import java.util.Random;

public class Test {
	public static Ferniture RandomFerniture() {
		Random random = new Random();
		int x = random.nextInt(3);
		if (x==0) {
			Chair chair = new Chair();
			chair.setLongg(random.nextInt(100)+40);
			chair.setWhide(random.nextInt(80)+40);
			chair.setHigh(random.nextInt(80)+50);
			chair.setLegs(4);
			int color = random.nextInt(3);
			if (color==0) {
				chair.setColor("white");
			}
			else if (color==1) {
				chair.setColor("black");
			}
			else {
				chair.setColor("brown");
			}
			return chair;
		}
		else if (x==1) {
			Table table = new Table();
			table.setLongg(random.nextInt(210)+100);
			table.setWhide(random.nextInt(180)+100);
			table.setHigh(random.nextInt(150)+100);
			table.setSits(random.nextInt(4)+6);
			int color = random.nextInt(3);
			if (color==0) {
				table.setColor("white");
			}
			else if (color==1) {
				table.setColor("black");
			}
			else {
				table.setColor("brown");
			}
			return table;
		}
		else {
			Bed bed = new Bed();
			bed.setLongg(random.nextInt(210)+100);
			bed.setWhide(random.nextInt(random.nextInt(200)+100));
			bed.setHigh(random.nextInt(100)+80);
			bed.setIsitDouble(random.nextBoolean());
			int color = random.nextInt(3);
			if (color==0) {
				bed.setColor("white");
			}
			else if (color==1) {
				bed.setColor("black");
			}
			else {
				bed.setColor("brown");
			}
			return bed;
		}
	}


	public static void main(String[] args) {
		Ferniture [] arr = new Ferniture[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i]= RandomFerniture();
			arr[i].display();
			arr[i].draw();
		}
		

	}

}
