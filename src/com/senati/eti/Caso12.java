package com.senati.eti;

import java.util.Scanner;

public class Caso12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Empleado: ");
		String empleado = sc.nextLine();
		System.out.print("Nivel: ");
		int nivel = sc.nextInt();
		System.out.print("sueldo: ");
		float sueldo = sc.nextFloat();
		
		float incremento = 0;
		
		switch (nivel) {
		case 1:
			incremento = 0.045f;
			break;
		case 2:
			incremento = 0.06f;
			break;
		case 3:
			incremento = 0.085f;
			break;
		case 4:
			incremento = 0.11f;
			break;
		default:
			incremento = 0;
		}
		
		System.out.println("\nResultados");
		System.out.println("Empleado....: "+empleado.toUpperCase());
		System.out.println("Nivel.......: "+nivel);
		System.out.println("Sueldo......: "+sueldo);
		System.out.println("Incremento..: "+(incremento*100) +"%");
		System.out.println("Nuevo sueldo: "+(sueldo+(sueldo*incremento)));
				

	}

}
