package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %s %s %s %s %s %s %n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: R$%.1f%n", 12345.4568);
		System.out.printf("Nome: %s%n", "João");
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
		
		entrada.close();
		
		/*
		Scanner teclado = new Scanner(System.in);
     
        System.out.println("Qual a sua idade?");
        int idade = teclado.nextInt();
        teclado.nextLine(); //lê o "\\\\n" que o teclado.nextInt() deixa para trás.
        System.out.println("Qual o seu nome?");
        String nome = teclado.nextLine();
        System.out.println("Qual o seu sobrenome?");
        String sobrenome = teclado.nextLine();
     
        teclado.close();
		*/
		
	}
}
