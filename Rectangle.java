package PA2;
public class Rectangle{
	//class variables
	private double length, width;
	private char name;
	public static int created;
	//constructor
	public Rectangle(double length, double width, char name) {
		length = this.length;
		width = this.width;
		name = this.name;
		created++;
	}
	//methods
	final double area() {
		double area = length * width;
		return area;
	}
	final double perimeter() {
		double perimeter = 2 * (length + width);
		return perimeter;
	}
	final int compareArea(Rectangle rectArg) {
		if(area() > rectArg.area()) {
			return 1;
		}
		else if(area() < rectArg.area()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	final int comparePerimeter(Rectangle rectArg) {
		if(perimeter() > rectArg.perimeter()) {
			return 1;
		}
		else if(perimeter() < rectArg.perimeter()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	static int numberOfRectangles() {
		return created;
	}
	public String toString() {
		String result = "(" + name + "," + length + "," + width + ")";
		return result;
	}
}