package practice05;

import java.util.Scanner;

public class ConversatioBook extends Book {
	private String language;
	public ConversatioBook() {}
	public ConversatioBook(int id, String comment, String productor, int price, String author, String bookTitle,
			String language) {
		super(id, comment, productor, price, author, bookTitle);
		this.language = language;
	}
	public Product add() {
		Product p= super.add();
		Book b = (Book)p;
		Scanner sc = new Scanner(System.in);
		System.out.print("언어>>");
		String leng = sc.next();
		return new ConversatioBook(b.getId(),b.getComment(),b.getProductor(),b.getPrice(),
				b.getBookTitle(), b.getAuthor(),
				leng);
	}
	
}
