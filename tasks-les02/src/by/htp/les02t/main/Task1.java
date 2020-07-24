package by.htp.les02t.main;

public class Task1 {
	
	public static void main (String[] args) {
		
		double a = 3;
		double b = 1;
		double c = 2;
		
		double res;
		
		res = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
		
		System.out.println(res);	
					
	}

}
