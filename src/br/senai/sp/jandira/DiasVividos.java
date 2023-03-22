package br.senai.sp.jandira;

import java.util.Scanner;

public class DiasVividos {

	public static void main(String[] args) {
		
		System.out.println("Qual a sua idade?");
		
		
		
		Scanner teclado = new Scanner(System.in);
		
		int v1 = teclado.nextInt();
		int v2 = v1 * 365;
		
		System.out.println("Você já viveu aproximadamente "+ v2 +" dias!");
		
		
		
		
		

	}

}
