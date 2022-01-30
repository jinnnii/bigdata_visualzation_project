package practice05;

import java.util.Scanner;

public class ProjuctInfo {

	private static int prodCnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product[] products = new Product[10];
		int selectNum = 0;
		while (selectNum != 4) {
			System.out.println("---------------------------------------------------");
			System.out.println("1 상품추가 | 2 상품조회 | 3 모든 상품조회 | 4 끝내기");
			System.out.println("---------------------------------------------------");

			System.out.println("선택>>");
			selectNum = sc.nextInt();

			switch (selectNum) {
			case 1:
				if(prodCnt>products.length) continue;
				System.out.print("상품의 종류 선택 : 1 책 | 2 앨범 | 3 회화책");
				int option = sc.nextInt();
				Product p = null;
				switch (option) {
				case 1:
					p = new Book();
				case 2:
					p = new CompactDisc();
				case 3:
					p = new ConversatioBook();
				}
				products[prodCnt] = p.add();
				prodCnt++;
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				System.out.println("잘못된 입력");
				break;
			}
		}
		sc.close();
	}

//	@SuppressWarnings("resource")
//	public static Product addProduct() {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("상품의 종류 선택 : 1 책 | 2 앨범 | 3 회화책");
//		int option = sc.nextInt();
//		System.out.println("상품설명>>");
//		String comment = sc.next();
//		System.out.println("생산자>>");
//		String productor = sc.next();
//		System.out.println("가격>>");
//		int price = sc.nextInt();
//
//		switch (option) {
//		case 1:
//			System.out.print("책제목>>");
//			String bookTitle = sc.next();
//			System.out.print("저자>>");
//			String author = sc.next();
//			return new Book(prodCnt+1, comment, productor, price, bookTitle, author);
//		case 2:
//			System.out.print("앨범제목>>");
//			String discTitle = sc.next();
//			System.out.print("가수>>");
//			String singer = sc.next();
//			return new CompactDisc(prodCnt+1, comment, productor, price, discTitle, singer);
//		case 3:
//			System.out.print("책제목>>");
//			String cBookTitle = sc.next();
//			System.out.print("저자>>");
//			String cAuthor = sc.next();
//			System.out.print("언어>>");
//			String leng = sc.next();
//			return new ConversatioBook(prodCnt+1, comment, productor, price, cBookTitle, cAuthor, leng);
//		}
//		sc.close();
//		return null;
//	}

}
