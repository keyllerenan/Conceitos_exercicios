package fundamentos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class DesafioModuloFundamentos {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.print("Informe o primeiro numero: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Informe o segundo numero: ");
		double num2 = entrada.nextDouble();
		
		System.out.print("Informe o operação: ");
		String op = entrada.next();
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		 	   resultado = "-".equals(op) ? num1 - num2 : resultado;
		 	   resultado = "*".equals(op) ? num1 * num2 : resultado;
		 	   resultado = "/".equals(op) ? num1 / num2 : resultado;
		 	   resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", 
				num1, op, num2,resultado);
		
		
		
	/*	
		String num1 = JOptionPane.showInputDialog(
				"Digite o primeiro número: ");
		
		String num2 = JOptionPane.showInputDialog(
				"Digite o segundo número número: ");
		
		String operacao = JOptionPane.showInputDialog(
				"Qual operação gostaria de usar. Ex> + - * /  : ");
		
		double numero1 = Double.parseDouble(num1);
		double numero2 = Double.parseDouble(num2);
		char operador = operacao.charAt(0);
		
		double calculo = numero1 +  operador + numero2;
		
		System.out.printf("O resultado é: %.2f%n", calculo);
	*/	
		entrada.close();
	}
}
