//Demo program to understand Exception handling

class ExceptionXY {

	int x, y, result;

	ExceptionXY(int x, int y) {
		this.x=x;
		this.y=y;
	}

	void divideXY() {
		try {
			result=x/y;
		}
		catch(Exception ae) {
			System.out.println("The Exception = " +ae);
		}
		finally {//optional
			System.out.println("Finally block excuted ");
		}
	}

	void showXY() {
		System.out.println("The result = "+result);	
	}
}

class Demo8 {
	public static void main(String arg[]) {
		
		ExceptionXY a1 = new ExceptionXY(10,0);

		a1.divideXY();
		a1.showXY();
	}
	
}






