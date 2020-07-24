package by.htp.les02t.main;

public class Task6 {
	
	public static void main(String[] args) {
		
		int a = 40;
		int b = 50;
		
		if (a + b > 180) {
			System.out.println("Треугольник не существует");
			
		} else {
			System.out.println("Треугольник сущестет");
			
		if(a == 90 || b == 90 || 180 - a - b == 90) {
			System.out.println("Треугольник прямоугольный");
			
		} else {
			System.out.println("Треугольник не прямоугольный");
		}
		}
	}

}
