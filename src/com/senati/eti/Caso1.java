package com.senati.eti;

import java.util.Scanner;

public class Caso1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese su edad: ");
		int edad = sc.nextInt();
		
		if (edad >= 18)
			System.out.println("Eres mayor de edad");
		else
			System.out.println("Eres menor de edad");
		
		
	}

}
