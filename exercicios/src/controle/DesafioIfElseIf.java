package controle;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioIfElseIf {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
//		String dado = JOptionPane.showInputDialog("Qual dia da semana: ");
		System.out.println("Qual o dia da semana: ");

		String dia = entrada.next();
		
		if ("domingo".equalsIgnoreCase(dia))
			System.out.println("1");
		else if ("segunda".equalsIgnoreCase(dia))
			System.out.println("2");
		else if ("terça".equalsIgnoreCase(dia) || "terca".equalsIgnoreCase(dia))
			System.out.println("3");
		else if ("quarta".equalsIgnoreCase(dia))
			System.out.println("4");
		else if ("quinta".equalsIgnoreCase(dia))
			System.out.println("5");
		else if ("sexta".equalsIgnoreCase(dia))
			System.out.println("6");
		else if ("sabado".equalsIgnoreCase(dia) || "sábado".equalsIgnoreCase(dia))
			System.out.println("7");
		else			
			System.out.println("Dia Inválido");
		
		
		
		entrada.close();
	}
}
