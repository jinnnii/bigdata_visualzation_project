package practice05;

import java.util.Scanner;

public class Product {
	private int id = 0;
	private String comment;
	private String productor;
	private int price;
	static int prodCnt =0;
	
	public Product() {
		prodCnt++;
	}
	public Product(int id, String comment, String productor, int price) {
		super();
		this.id = id;
		this.comment = comment;
		this.productor = productor;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getProductor() {
		return productor;
	}

	public void setProductor(String productor) {
		this.productor = productor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Product add() {
		Scanner sc = new Scanner(System.in);
		System.out.print("상품설명>>");
		String comment = sc.nextLine();
		System.out.print("생산자>>");
		String productor = sc.nextLine();
		System.out.print("가격>>");
		int price = sc.nextInt();
		return new Product(this.prodCnt, comment, productor,price);
	}
	
	public void display() {
		System.out.printf("%d\t%s\t%s\t%d\t",id,comment,productor,price);
	}
	
}
