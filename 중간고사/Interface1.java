import java.io.*;

class Temperature {
	double[] T_data;

	public Temperature (int a, int b, int c, int d) {
		this.T_data[0] = a;
		this.T_data[1] = b;
		this.T_data[2] = c;
		this.T_data[3] = d;	
	}	
	
	public double max() {
		double mx = this.T_data[0];
		for(int i = 0; i< this.T_data.length; i++)
			if(mx<this.T_data[i]) {
				mx = this.T_data[i];
			}
		return (mx);	
	}
}
class Interface1 {
	public static void main(String args[]) throws IOException {
		
		Temperature temp;
		int x, y, a, b;
		double max;

		x = System.in.read() - '0';
		y = System.in.read() - '0';
		a = System.in.read() - '0';
		b = System.in.read() - '0';
				
		temp = new Temperature(x, y, a, b);
		max = temp.max();
		System.out.printf("max=%d", max);
	}
}