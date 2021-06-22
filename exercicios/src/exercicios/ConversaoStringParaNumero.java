package exercicios;

import javax.swing.JOptionPane;

public class ConversaoStringParaNumero {
		public static void main(String[] args) {
			String valor1 = JOptionPane.showInputDialog("Digite um numero !");
			String valor2 = JOptionPane.showInputDialog("Digite segundo valor:");
			System.out.println(valor1);
			
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		
		
		double soma = numero1 + numero2;
		System.out.println("Soma é"+ soma);
		System.out.println("Media é" + soma / 2);
		}
}
