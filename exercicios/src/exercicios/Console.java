package exercicios;

import java.util.Scanner;

public class Console {
public static void main(String[] args) {
	System.out.print("Bom");
	System.out.print(" Dia");
	
	System.out.printf("\n Megasena: %d %d %d %d %d %d" ,1,2,3,4,5,6);
	
	System.out.printf("\n Salario: %.1f",1234.5623);
	
	
	Scanner entrada = new Scanner (System.in);
	
	System.out.print("\n Digite seu nome: ");
	String nome = entrada.nextLine();
	
	System.out.print("\n Digite seu sobrenome: ");
	String sobrenome = entrada.nextLine();
	
	System.out.print("\n Digite sua idade: ");
	int idade = entrada.nextInt();
	
	System.out.printf("%s %s tem %d anos %n",nome,sobrenome,idade);
	
	entrada.close();
}
}
