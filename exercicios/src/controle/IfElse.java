package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Digite o valor: ");
		int numero = Integer.parseInt(valor);
		
		if (numero % 2 == 0) 
			System.out.println("Valor é par!");
			else 
				System.out.println("Valor é ímpar!");
		
	}
}
