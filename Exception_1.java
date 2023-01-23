import java.io.*;


Diff diff = new Diff();

diff -> new Diff 




class Get_n_1 {
	int getnum() {
		int n = (int)(Math.random() * 10);
		System.out.println(n);
		if(n==0) return -1;
		else return (n);
	}
}

class Get_m_1 {
	Get_n_1 gn;
	Get_m_1(Get_n_1 gn) {
		this.gn = gn;
	}
	int getmod() {
		int x, y, m;
		if((x=gn.getnum())<0 || (y=gn.getnum()) <0 || (m=(x%y)) == 0) return -1;
		System.out.printf("<%d,%d>", x, y);
		return (m);
	}
}

class Exception_1 {
	public static void main(String args[]) {
		Get_n_1 rd = new Get_n_1();
		Get_m_1 md = new Get_m_1(rd);
		int m;
		while(true) {
			if((m=md.getmod()) <0)
				break;
			System.out.println("-->");
		}
		System.out.println("Stop...");
	}
}