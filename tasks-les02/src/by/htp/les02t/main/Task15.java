package by.htp.les02t.main;

public class Task15 {
	
	public static void main(String[] args) {
		
		int a = 16;
		int b = 12;
		int c;
		
		while (a % b != 0) {
			
			c = a % b;
			a = b;
			b = c;
		}
		System.out.println("НОД = " + b);	
	}
}
