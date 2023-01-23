import java.io.*;

class MyRndException_31 extends Exception {
}

class MyModException_32 extends Exception {
}

class Get_n_3 {
	int getnum() throws MyRndException_31 {
		int n;
	
		n = (int)(Math.random() * 10);
		System.out.println(n);
		if(n==0) 
			throw new MyRndException_31();
		return (n);
	}
}

class Get_m_3 {
	Get_n_3 gn;
	Get_m_3(Get_n_3 gn) {
		this.gn = gn;
	}
	int getmod() throws MyRndException_31 {
		int x, y, m;
		
		try {
			x = gn.getnum();
			y = gn.getnum();
			if((m = (x%y)) == 0)
				throw new MyModException_32();
		} catch (MyModException_32 e) {
			System.out.println("MyModException_32");
			return -1;
		}
		System.out.printf("<%d,%d>", x, y);
		return(m);
	}
}

class Exception_3 {
	public static void main(String args[]) {
		Get_n_3 rd = new Get_n_3();
		Get_m_3 md = new Get_m_3(rd);
		int m;
		while(true) {
			try {
				if((m=md.getmod()) <0) 
					break;
			} catch(MyRndException_31 e) {
				System.out.println("MyRndException_31");
				break;
			}
			System.out.println("-->"+m);
		}
		System.out.println("Stop...");
	}
}