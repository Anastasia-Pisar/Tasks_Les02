package by.htp.les02t.main;

public class Task3 {
	
	public static void main(String[] args) {
		
        double A;
		
        A = 900.0; // А в байтах
		System.out.println("A = " + A + " Байт" );
        
        A = A / 1024.0; // А в килобайтах
		System.out.println("A = " + A + " КБайт" );
        
        A = A / 1024.0; // A в мегабайтах
		System.out.println("A = " + A + " MБайт" );
        
        A = A / 1024.0; // А в гигабайтах
		System.out.println("A = " + A + " ГБайт" );
        
        A = A / 1024.0; // А в терабайтах
		System.out.println("A = " + A + " ТБайт" );
	}
}
