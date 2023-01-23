import java.io.*;

class MyRndException_51 extends Exception {
}

class MyModException_52 extends Exception {
}

class Get_n_5 {
	int getnum() throws MyRndException_51 {
		int n;
	
		n = (int)(Math.random() * 10);
		System.out.println(n);
		if(n==0) 
			throw new MyRndException_51();
		return (n);
	}
}

class Get_m_5 {
	Get_n_5 gn;
	Get_m_5(Get_n_5 gn) {
		this.gn = gn;
	}
	int getmod() throws MyRndException_51, MyModException_52 {
		int x, y, m;
		
		x = gn.getnum();
		y = gn.getnum();
			
		if((m = (x%y)) == 0)
			throw new MyModException_52();
		System.out.printf("<%d,%d>", x, y);
		return (m);
	}
}

class Exception_5 {
	public static void main(String args[]) {
		Get_n_5 rd = new Get_n_5();
		Get_m_5 md = new Get_m_5(rd);
		int m;
		while(true) {
			try {
				m = md.getmod();
			}
			catch(Exception e) {
				if(e.toString().equals("MyRndException_51")) 
						System.out.println("MyRndException_51");
				else if(e.toString().equals("MyModException_52"))
						System.out.println("MyModException_52");
				break;
			}
			System.out.println("-->"+m);
		}
		System.out.println("Stop...");
	}
}