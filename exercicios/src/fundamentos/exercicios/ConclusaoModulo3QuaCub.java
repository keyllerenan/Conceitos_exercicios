package fundamentos.exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ConclusaoModulo3QuaCub {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String valor1 = JOptionPane.showInputDialog(
				" Digite o primeiro valor: ");
		double num1 = Double.parseDouble(valor1);				
		
		double calculo1 = Math.pow(num1, 2);				
		double calculo2 = Math.pow(num1, 3);				
		
		System.out.printf("O valor ao quadrado é: %s e ao cubo é: %s", calculo1, calculo2);
		
		entrada.close();
	}
}
