package controle;

import java.util.Scanner;

public class DesafioIf {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nota: ");
		double nota = entrada.nextDouble();
		
		if(nota <= 1.3){
			System.out.println("N�o passou!");
		}
		
		if(nota >= 9.0){
			System.out.println("Quadro de Honra!");
			System.out.println("Voc� � fera!");
		}
		
		entrada.close();
	}

}
