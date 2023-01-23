package kor.ptln;

import kor.ptln.Point_5;

public class Line_5 extends Point_5 {
	int a, b;
	
	Line_5(int x, int y, int a, int b) {
		super(x, y);
		this.a = a;
		this.b = b;
	}
	int get_a() {
		if(a<0) 
		return 0;
		else
		return a;
	}
	int get_b() {
		if(b<0)
		return 0;
		else 
		return b;
	}
	
	int get_x() {
		if(x>0) return (x);
		else return (0);
	}
	int get_y() {
		if(y>0) return (y);
		else return (0);
	}

	public double get_dl() {
		double dl;
		dl = Math.sqrt(Math.pow(get_x(x) - a, 2) + Math.pow(get_y() - b, 2));
		return (dl);
	}
}