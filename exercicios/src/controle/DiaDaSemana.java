package controle;

import java.util.Scanner;

public class DiaDaSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o nome do dia :");
		
		String dia = entrada.next();
		
		if("domingo".equalsIgnoreCase(dia)) {
			System.out.println(1);
		}else if("segunda".equalsIgnoreCase(dia)) {
			System.out.println(2);
		}
		
		
		
		entrada.close();
	}
}
