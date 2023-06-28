package paint;

public class Main {
	public static void main(String[] args) {
		Point point1 = new Point();
		point1.setX(100);
		point1.setY(50);
		drawPoint(point1);
		point1.show(false);
		
		Point point2 = new Point(200, 150);
		drawPoint(point2);
		point2.show(false);
		
//		Point point3 = new ColorPoint();
//		point3.setX(200);
//		point3.setY(100);
		Point point3 = new ColorPoint(200, 100, "red");
		point3.setX(200);
		point3.setY(100);
		((ColorPoint)point3).setColor("red");
		drawPoint(point3);
	}
	
	public static void drawPoint(Point point) {
		point.show(true);
	}
	
//	public static void drawColorPoint(ColoPoint colorPoint) {
//		colorPoint.show();
//	}
	
}
