package bb;

import java.util.TreeSet;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Point> ts = new TreeSet<Point>();
		ts.add(new Point(1,2));
		ts.add(new Point(3,4));
		ts.add(new Point(-1,2));
		ts.add(new Point(3,-4));
		
		for (Point p : ts) {
			System.out.println(p);
		}
	}

}
