class point {
	private int x;
	private int y;
	point(int a, int b) {
		set_xy(a, b);
	}
	
	void set_xy(int a, int b) {
		this.x= a;
		this.y = b;
	}

	int get_x() {
		return x;
	}
	int get_y() {
		return y;
	}
}