package br.com.faeterj;

import java.util.Scanner;

public class Main {
		
		
		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			Triangulo tri = new Triangulo();
			
			System.out.println("Digite os lados do triângulo ");
			tri.a = sc.nextDouble();
			tri.b = sc.nextDouble();
			tri.c= sc.nextDouble();
			
			double area = tri.CalculandoAreaDoTriangulo();
			
			System.out.println("\nÁrea do triângulo é igual a : " + area);
			
			sc.close();
		
	}

}
