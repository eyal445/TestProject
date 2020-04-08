package Library;

import java.util.Arrays;

public class Storage {
	private Book[] books;
	private int[] inStock;

	public Storage() {
		books = new Book[6];
		inStock = new int[6];
	}

	public Storage(Book[] books, int[] inStock) {
		this.books = books;
		this.inStock = inStock;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	public int[] getInStock() {
		return inStock;
	}

	public void setInStock(int[] inStock) {
		this.inStock = inStock;
	}

	@Override
	public String toString() {
		return "Storage [books=" + Arrays.toString(books) + ", inStock=" + Arrays.toString(inStock) + "]";
	}

	public void addBook(Book Newbook, int amount) {
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null && books[i].equals(Newbook)) {
				inStock[i] = inStock[i] + amount;
				return;

			} else if (books[i] == null) {
				books[i] = Newbook;
				inStock[i] = amount;
				return;
			}
		}
		int x = books.length;
		Book[] tembook = new Book[x];
		int[] temStock = new int[x];
		for (int i = 0; i < x; i++) {
			tembook[i] = books[i];
			temStock[i] = inStock[i];

		}
		books = new Book[x + 1];
		inStock = new int[x + 1];
		for (int i = 0; i < x; i++) {
			books[i] = tembook[i];
			inStock[i] = temStock[i];

		}
		books[x] = Newbook;
		inStock[x] = amount;
		

	}

	public void rentBook(Book book) {
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null && book.equals(book)) {
				if (inStock[i] > 0) {
					inStock[i] = inStock[i] - 1;

				}

			}

		}
		System.out.println("this book is not exist");

	}

	public void returnBook(Book book) {
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null && books[i].equals(book)) {
				inStock[i] = inStock[i] + 1;
			}

		}
		System.out.println("do you sure its belong to us?");

	}

	public int getInStock(Book book) {
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null && books[i].equals(book)) {
				return inStock[i];

			}

		}
		return 0;

	}
}