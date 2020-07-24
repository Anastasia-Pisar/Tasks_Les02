package by.htp.les02t.main;

public class Task8 {
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = 4;
		
		int x = 2;
		int y = 3;
		int z = 6;
		
		if (((x <= a && y <= b) || (y <= a && x <= b))
		 || ((x <= a && z <= b) || (z <= a && x <= b))
		 || ((y <= a && z <= b) || (z <= a && y <= b))) {
			System.out.println("Кирпич пройдет");
		}
		else {
			System.out.println("Кирпич не пройдет");			
		}
			
	}

}
