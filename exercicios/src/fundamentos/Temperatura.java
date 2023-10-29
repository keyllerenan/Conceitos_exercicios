package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
//		double fahrenheit = 32;
//		double temp1 = 5;
//		double temp2 = 9.0;
//		double celsius = (fahrenheit) * temp1 / temp2;
		
		final double FATOR = 5 / 9.0;
		final int AJUSTE = 32;
		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é "+ celsius);
		
		fahrenheit = 150;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é "+ celsius);
		
	}
}
