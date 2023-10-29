package fundamentos.exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ConclusaoModulo3IMC {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String peso = JOptionPane.showInputDialog(
				"Digite aqui o seu peso: ");
		double kg = Double.parseDouble(peso);
		
		String altura = JOptionPane.showInputDialog(
				"Digite aqui o seu peso: ");
		double metro = Double.parseDouble(altura);
		
		double imc = kg / (metro * metro);
		
		System.out.printf("Seu IMC é: " + imc);
		
		
		entrada.close();
	}
}
