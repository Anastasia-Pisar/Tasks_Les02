package by.htp.les02t.main;

public class Task9 {
	
	public static void main(String[] args) {
		
		double x = 2;
		double f;
		
		if(x <= 3) {
			
			f = Math.pow(x, 2) - 3 * x + 9;
			
		} else {
			
			f = 1 / (Math.pow(x, 3) + 6);
		}
		System.out.println(f);
	}
}
