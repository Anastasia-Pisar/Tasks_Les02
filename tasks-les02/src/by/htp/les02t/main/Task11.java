package by.htp.les02t.main;

public class Task11 {
	
	public static void main(String[] args) {
		
			
		double a = 0;
		double b = 10;
		double h = 1;
		double y;
		double x;
		
		for (x = a; x <= b - h; x = x + h ) {
			System.out.print("x = " + x + ", ");
			if (x > 2) {
				y = x + h;
				System.out.println("y = " + y);
			}
			else {
				y = - x;
				System.out.println("y = " + y);
				
			}
		}
		
	}

}
