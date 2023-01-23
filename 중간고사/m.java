import java.io.*;

class m {
	public static void main(String args[]) throws IOException {
	
	point pnt1, pnt2;
	
	double dl;
	int x1, y1, x2, y2;

	x1 = System.in.read() - '0';
	y1 = System.in.read() - '0';
	x2 = System.in.read() - '0';
	y2 = System.in.read() - '0';

	pnt1 = new point(x1, y1);
	pnt2 = new point(x2, y2);

	dl = Math.sqrt(Math.pow(pnt1.get_x()- pnt2.get_y(), 2) + Math.pow(pnt1.get_y()- pnt2.get_y(), 2));
	
	System.out.printf("dl=%f", dl);

	}
}
		