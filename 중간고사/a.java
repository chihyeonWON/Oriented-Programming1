import java.io.*;

interface Measure {
	public double max(int T_data[]);
}

class Temperature implements Measure {
	
	public double max(int T_data[]) {
		int max;
		max = T_data[0];
		for(int i=0; i<T_data.length; i++) {
			if(max<T_data[i]) max = T_data[i];
		}
		return max;
	}
}

class a {
	public static void main(String args[]) throws IOException {
		Temperature temp = new Temperature();
		int[] x = new int[4];
		int a, b, c, d;
		double max;
		a = System.in.readLine()-'0';   
		b = System.in.read() -'0';
		c = System.in.read() -'0';
		d = System.in.read() -'0';
			
		x[0] = a;
		x[1] = b;
		x[2] = c;
		x[3] = d;

		max=temp.max(x);
		
		System.out.printf("%f", max);
	}
}
		

	
