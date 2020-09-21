package PA2;
import java.util.*;
class Test{
	public static int comparison;
	private int[] array;
	public static void main(String[] args) {
		System.out.println("*****Rectangle Verification*****");
		testRectangle();
		System.out.println("*****END*****");
		System.out.println("*****Max and Count Verification*****");
		testMaxAndCount();
		System.out.println("*****END*****");
	}
	private static void testRectangle() {
		//create rectangles
		Rectangle rectA = new Rectangle(15, 10, 'A');
		Rectangle rectB = new Rectangle(5, 100, 'B');
		Rectangle rectC = new Rectangle(30, 5, 'C');
		Rectangle rectD = new Rectangle(20, 5, 'D');
		Rectangle rectE = new Rectangle(10, 5, 'E');
		//print number of rectangles created
		System.out.println("Number of rectangles created is  " + Rectangle.created);
		System.out.println("");
		//print created rectangles
		System.out.println("Rectangle " + rectA + " has been created.");
		System.out.println("Rectangle " + rectB + " has been created.");
		System.out.println("Rectangle " + rectC + " has been created.");
		System.out.println("Rectangle " + rectD + " has been created.");
		System.out.println("Rectangle " + rectE + " has been created.");
		System.out.println("");
		//print area of rectangle A
		System.out.println("The area of Rectangle A is " + rectA.area());
		System.out.println("");
		//print perimeter of rectangle B
		System.out.println("The perimeter of Rectangle B is " + rectB.perimeter());
		System.out.println("");
		//comparison area
		comparisonMethod(comparison, "Area", rectA, rectB);
		comparisonMethod(comparison, "Area", rectA, rectC);
		comparisonMethod(comparison, "Area", rectA, rectD);
		System.out.println("");
		//comparison perimeter
		comparisonMethod(comparison, "Perimeter", rectA, rectB);
		comparisonMethod(comparison, "Perimeter", rectA, rectD);
		comparisonMethod(comparison, "Perimeter", rectA, rectE);
	}
	private static void testMaxAndCount() {	
		//create array
		int[] testArray = {-13, 47,-13, 21, 51, -13, 77, 1, -13};
		//create object
		MaxAndCount test = new MaxAndCount(testArray);
		//print array
		System.out.println("Array is: " + Arrays.toString(testArray));
		System.out.println("");
		//print maximum
		System.out.println("Greatest number in the array is " + test.findMax());
		System.out.println("");
		//overload
		System.out.println("Greatest number in the array [-1,5] is " + test.findMax(-1,5));
		System.out.println("Greatest number in the array [1,10] is " + test.findMax(1,10));
		System.out.println("Greatest number in the array [6,5] is " + test.findMax(6,5));
		System.out.println("Greatest number in the array [1,5] is " + test.findMax(1,5));
		System.out.println("Greatest number in the array [2,2] is " + test.findMax(2,2));
		//number of occurances
		int keyA = 14;
		int keyB = 1;
		System.out.println("The amount of occurances of the number 14: " + MaxAndCount.countKey(keyA));
		System.out.println("The amount of occurances of the number 1: " + MaxAndCount.countKey(keyB));
		//-13
		int keyC = -13;
		System.out.println("The ammount of occurances of the number -13: " + MaxAndCount.countKey(keyC));
		System.out.println("The ammount of occurances of the number -13 in the array [-1,5]: " + MaxAndCount.countKey(-1,5,keyC));
		System.out.println("The ammount of occurances of the number -13 in the array [1,10]: " + MaxAndCount.countKey(1,10,keyC));
		System.out.println("The ammount of occurances of the number -13 in the array [6,5]: " + MaxAndCount.countKey(6,5,keyC));
		System.out.println("The ammount of occurances of the number -13 in the array [1,5]: " + MaxAndCount.countKey(1,5,keyC));
		System.out.println("The ammount of occurances of the number -13 in the array [2,2]: " + MaxAndCount.countKey(2,2,keyC));
	}
	public static void comparisonMethod(int comparison, String areaPerimeter, Rectangle rect1, Rectangle rect2){
		if(areaPerimeter.equalsIgnoreCase("Area")) {
			comparison = rect1.compareArea(rect2);
			areaPerimeter = "area";
		}
		else if(areaPerimeter.equalsIgnoreCase("Perimeter")) {
			comparison = rect1.comparePerimeter(rect2);
			areaPerimeter = "perimeter";
		}
		switch(comparison){
				case 1:
					System.out.println("The " + areaPerimeter + " of Rectangle " + rect1.getName() + " is greater than that of Rectangle " + rect2.getName() + ".");
					break;
				case 0:
					System.out.println("The " + areaPerimeter + " of Rectangle " + rect1.getName() + " is equal to that of Rectangle " + rect2.getName() + ".");
				case -1:
					System.out.println("The " + areaPerimeter + " of Rectangle " + rect1.getName() + " is less than that of Rectangle " + rect2.getName() + ".");
					break;
		}
	}
}
