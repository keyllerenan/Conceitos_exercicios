package fundamentos.exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ConclusaoModulo3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String fah = JOptionPane.showInputDialog(
				"Digite o grau Celsio: ");
		double numC = Double.parseDouble(fah);
		
		String ceu = JOptionPane.showInputDialog(
				"\nDigite o grau Fahrenheit: ");
		double numF = Double.parseDouble(ceu);
		
		double conv1 = (int) (numF - 32) / 1.8;
		double conv2 = (int) (numC * 1.8) + 32;
		
		
		System.out.printf("A temperatura em Fahrenheit é: " + conv1);
		System.out.printf("A temperatura em Celsius é: " + conv2);
		
		
		entrada.close();
	}
}
