package by.htp.les02t.main;

public class Task3 {
	
	public static void main(String[] args) {
		
		int A;
        double K;
        double M;
        double G;
        double T;
   
        A = 1024;
        
        K = A / 1024;
        M = K / 1024;
        G = M / 1024;
        T = G / 1024;
        
        System.out.println("Объем информации в килобайтах = " + K);
        System.out.println("Объем информации в мегабайтах = " + M);
        System.out.println("Объем информации в гигабайтах = " + G);
        System.out.println("Объем информации в тераабайтах = " + T);   
        
	}

}
