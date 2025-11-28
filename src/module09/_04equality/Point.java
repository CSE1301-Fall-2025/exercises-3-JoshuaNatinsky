package module09._04equality;

public class Point {
	
	//
	// has-a x and y coordinate, both integers
	//  these are immutable so you should declare them "final"
	//
	// declare instance variables here:
	//
	private final int x;
	private final int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(x, y);
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	public static void main(String[] args) {
		Point p1 = new Point(1, 2);
		Point p2 = new Point(1, 3);
		Point p3 = new Point(1, 2);

		System.out.println("p1.equals(p2): " + p1.equals(p2));
		System.out.println("p1.equals(p3): " + p1.equals(p3));
		System.out.println("p1 == p3: " + (p1 == p3));

		java.util.Set<Point> points = new java.util.HashSet<>();
		points.add(p1);
		points.add(p2);
		points.add(p3);
		System.out.println("Set size (should be 2): " + points.size());
		System.out.println("Set contains p3: " + points.contains(p3));
	}

}
