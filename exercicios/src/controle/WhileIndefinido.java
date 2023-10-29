 package controle;

import java.util.Scanner;

public class WhileIndefinido {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String valor = "";
		
		while (!valor.equalsIgnoreCase("sair")) {
			System.out.print("Você digitou: ");
			valor = entrada.nextLine();
		}
		
		entrada.close();
		
	}
}
