package practice05;

import java.util.Scanner;

public class Book extends Product{
	private String author;
	private String bookTitle;
	
	public Book() {}
	
	public Book(int id, String comment, String productor, int price, String author, String bookTitle) {
		super(id, comment, productor, price);
		this.author = author;
		this.bookTitle = bookTitle;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public Product add() {
		Product p= super.add();
		Scanner sc = new Scanner(System.in);
		System.out.print("책제목>>");
		
		String bookTitle = sc.nextLine();
		System.out.print("저자>>");
		String author = sc.nextLine();
		return new Book(p.getId(),p.getComment(),p.getProductor(),p.getPrice(),
				bookTitle,author);
	}
	
	public void display() {
		super.display();
		System.out.printf("%s\t%s",bookTitle,author);
	}
}
