package br.com.faeterj;

import java.lang.Math;

public class Triangulo {
	public double a;
	public double b;
	public double c;
	
	public double CalculandoAreaDoTriangulo() {
		double p = (a+b+c)/2;
		return Math.sqrt(p *(p-a) * (p-b) * (p-c));
		
	}
}