package fundamentos.exercicios;

import java.util.Scanner;

public class ConclusaoModulo3Bhaskara {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		// Coeficientes da equação
        double a = 1;
        double b = 12;
        double c = -13;

        // Calcular o discriminante (delta)
        double delta = (b * b) - (4 * a * c);
        System.out.println(delta);

        // Verificar o valor de delta
        if (delta > 0) {
            // Duas raízes reais distintas
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Raiz 1: " + x1);
            System.out.println("Raiz 2: " + x2);
        } else if (delta == 0) {
            // Uma raiz real (raiz dupla)
            double x = -b / (2 * a);
            System.out.println("Raiz única: " + x);
        } else {
            // Sem raízes reais (raízes complexas)
            System.out.println("Sem raízes reais, raízes complexas.");
        }
        
        input.close();
		
	}
}
