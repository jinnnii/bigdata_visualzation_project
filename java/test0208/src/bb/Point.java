package bb;

public class Point implements Comparable<Point>{
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "(x:" + x + ", y:" + y + ")";
	}

	@Override
	public int compareTo(Point o) {
		// TODO Auto-generated method stub
		if(x+y<o.x+o.y) return -1;
		else if(x+y==o.x+o.y) return 0;
		else return 1;
	}
	
	
}
