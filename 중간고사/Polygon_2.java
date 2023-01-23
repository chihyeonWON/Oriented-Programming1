import java.io.*;
class Polygon {
	int nPolygon;
	int getNumber() {
		return nPolygon;
	}
	class Rectangle {
		int width;
		int height;

		Rectangle(int width, int height) {
			this.height = height;
			this.width = width;
			Polygon.nPolygon += 1;
		}
	}
	class Triangle {
		int width;
		int height;

		Rectangle(int width, int height) {
			this.height = height;
			this.width = width;
			Polygon.nPolygon += 1;
		}
	}
}

class Polygon_2 {
	public static void main(String args[]) throws IOException {
		Polygon polygon;
		polygon = new Polygon();
		Polygon.Rectangle rectangle, rectangle2;
		Polygon.Triangle triangle;
		rectangle = polygon.new Rectangle(1,2);
		rectangle2 = polygon.new Rectangle(2,3);
		triangle = polygon.new Triangle(1,3);
		int total, i;
		i = rectangle2.width;	
		total = polygon.getNumber();
		System.out.printf("%d, %d", i, total);
	}	
}