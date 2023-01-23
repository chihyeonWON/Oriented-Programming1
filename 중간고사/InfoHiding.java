import java.io.*;

class Point_2 {
	int x;
	x = 3;
	int y;

    void set_xy(int x, int y) {
        if (x<0)
            System.err.println("Value of x is invalid");
        else if (y<0)
            System.err.println("Value of y is invalid");
        else {
            this.x = x;
            this.y = y;
        }
    }

    void set_X(int x) {
        if (x<0) System.out.println("Value of x is invalid");
        else this.x = x;
    }

    void set_y(int y) {
        if (y<0) System.out.println("Value of y is invalid");
        else this.y = y;
    }
    
    int get_x() {
        return x + 2;
    }

    int get_y() {
        return y;
    }
}

class InfoHiding {
	public static void main(String[] args) throws IOException {
		Point_2 pnt1, pnt2;
		int x1, y1, x2, y2;
		double dl;
		
		x1 = System.in.read() - '0';
		y1 = System.in.read() - '0';
		x2 = System.in.read() - '0';
		y2 = System.in.read() - '0';
		
		pnt1 = new Point_2();
		pnt1.set_xy(x1, y1);
		pnt2 = new Point_2();
		pnt2.set_xy(x2, y2);

		dl = Math.sqrt(Math.pow(pnt1.get_x()-pnt2.get_x(), 2) + Math.pow(pnt1.get_y()-pnt2.get_y(), 2));
		
		System.out.printf("dl = %f\n", dl);
	}
}
		
	