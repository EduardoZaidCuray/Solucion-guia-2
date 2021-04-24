package com.senati.eti;

import java.util.Scanner;

public class Caso7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese sueldo: ");
		float sueldo = sc.nextFloat();
		
		float impuesto = 0;
		
		if (sueldo <= 1500)
			impuesto = sueldo * 0.03f;
		else if(sueldo > 1500 && sueldo <= 3000)
			impuesto = sueldo * 0.08f;
		else
			impuesto = sueldo * 0.12f;
		
		System.out.println("\nResultado");
		System.out.println("Sueldo..: "+sueldo);
		System.out.println("Impuesto: "+impuesto);
		System.out.println("Neto....: "+(sueldo - impuesto));

	}

}
