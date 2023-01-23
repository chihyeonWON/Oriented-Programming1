import java.io.*;
class AddSub_2 {
	int total;
	
	AddSub_2(int total) {
		this.total = 0;
	}

	class Add {
		int total;

		int add2c(int a, int b) {
			int s = a+b;
			AddSub_2.this.total += s;
			total += s;
			return(s);
		}
		float add2c(float a, float b) {
			float s = a+b;
			total += s;
			return(s);
		}
	}
	class Sub {
		int sub2c(int a, int b) {
			int s= a-b;
			total -= s;
			return(s);
		}
		float sub2c(float a, float b) {
			float s = a-b;
			total -= s;
			return(s);
		}
	}
}

class STEP_03_AddSub_1 {
	public static void main(String args[]) throws IOException {
		AddSub_2 addsub;
		AddSub_2.Add add1, add2;
		AddSub_2.Sub sub1, sub2;
	
		int 
		addsub = new AddSub_1();
		add1 = addsub.new Add();

		add1.add2c(i, j);
	}
}
