package practice06;

public class Magazine extends Book{

	private String date;
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public static void main(String[] args) {
		Magazine[] ms = new Magazine[2];
		ms[0] = new Magazine();
		ms[0].setTitle("잡지A");
		ms[0].setPages(10);
		ms[0].setWriter("기자A");
		ms[0].setDate("2010년 2월 25일");
		
		ms[1] = new Magazine();
		ms[1].setTitle("잡지B");
		ms[1].setPages(20);
		ms[1].setWriter("기자B");
		ms[1].setDate("2010년 3월 8일");
		
		for(Magazine m:ms) {
			System.out.println("책이름 : "+m.getTitle());
			System.out.println("페이지수 : "+m.getPages());
			System.out.println("저자 : "+m.getWriter());
			System.out.println("발매일 : "+m.getDate());
			System.out.println();
		}
	}

}
