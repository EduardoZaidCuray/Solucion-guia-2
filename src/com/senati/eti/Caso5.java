package com.senati.eti;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese Precio: ");
		float precio = sc.nextFloat();
		System.out.print("Ingrese Cantidad: ");
		int cantidad = sc.nextInt();
		
		float dscto = 0;
		float total = cantidad * precio;
		
		if (cantidad > 8)
			dscto = total * 0.1f;
		
		System.out.println("Total    : " + total);
		System.out.println("Descuento: "+dscto);
		System.out.println("Neto     : "+(total - dscto));

	}

}
