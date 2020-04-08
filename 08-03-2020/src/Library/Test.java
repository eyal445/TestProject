package Library;

public class Test {

	public static void main(String[] args) {
		Book b1 = new Book(111, "aaa", 80);
		Book b2 = new Book(123, "bbb", 79);
		BestSeller b3 = new  BestSeller(3546, "gik", 89, "hjk", 78);
		BestSeller b4 = new BestSeller(2356, "hjk", 57, "ghj", 360);
		Book b5 = new Book(578, "jjj", 90);
		Book b6 = new Book(690, "kkk", 87.9);
		//Book b7 = new Book(467, "gkj", 120);
		//Book b8 = new Book(111, "aaa", 80);
		Book [] books={b1,b2,b3,b4,b5,b6};
		int [] inStock={60,70,90,90,89,100};
		Storage s1 = new Storage(books, inStock);
		System.out.println(s1);
		s1.addBook(new Book(289, "hjk", 80), 100);
//		s1.addBook(b8, 80);
		System.out.println();
		System.out.println(s1);
		s1.rentBook(b6);;
		System.out.println(s1);
		s1.returnBook(b4);
		System.out.println(s1);
		System.out.println(s1.getInStock(b1));
		}

	}


