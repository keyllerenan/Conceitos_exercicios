package fundamentos.exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ConclusaoModulo3Triangulo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String valor1 = JOptionPane.showInputDialog(
				"Digite a Largura da base do seu triângulo: ");
		double base = Double.parseDouble(valor1);
		
		String valor2 = JOptionPane.showInputDialog(
				"Digite a Altura do seu triângulo: ");
		double altura = Double.parseDouble(valor2);
		
		double resultado = base * altura / 2;
		
		System.out.printf("O resultado da área do seu triângulo é: %s.3f", resultado);
		
		
		
		entrada.close();
	}
}
