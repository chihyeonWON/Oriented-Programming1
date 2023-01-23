import java.io.*;

class MyRndException_61 extends Exception {
}

class MyModException_62 extends Exception {
}

class Get_n_6 {
	int getnum() throws MyRndException_61 {
		int n;
	
		n = (int)(Math.random() * 10);
		System.out.println(n);
		if(n==0) 
			throw new MyRndException_61();
		return (n);
	}
}

class Get_m_6 {
	Get_n_6 gn;
	Get_m_6(Get_n_6 gn) {
		this.gn = gn;
	}
	int getmod() throws MyRndException_61, MyModException_62 {
		int x, y, m;
		
		x = gn.getnum();
		y = gn.getnum();
			
		if((m = (x%y)) == 0)
			throw new MyModException_62();
		System.out.printf("<%d,%d>", x, y);
		return (m);
	}
}

class Exception_6 {
	public static void main(String args[]) {
		Get_n_6 rd = new Get_n_6();
		Get_m_6 md = new Get_m_6(rd);
		int m=0;
		while(true) {
			try {
				m = md.getmod();
			}
			catch(MyRndException_61 e) {
				System.out.println("MyRndException_61");
				break;
			} catch(MyModException_62 e) {
				System.out.println("MyModException_62");
				break;
			} finally {
				System.out.println("-->"+m);
			}
		}
		System.out.println("Stop...");
	}
}