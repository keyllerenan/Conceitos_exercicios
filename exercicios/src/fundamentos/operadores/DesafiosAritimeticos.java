package fundamentos.operadores;

public class DesafiosAritimeticos {
	public static void main(String[] args) {
	
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 5;
		int e = 6;
		int f = 7;
		int g = 10;
		
		int func1 = (int) Math.pow(e * (c + b), b);
		int func2 = c * b;
		int func3 = func1 / func2;
		
		int func4 = (a - d) * (b - f) / b;
		int func5 = (int) Math.pow((a - d) * (b - f) / b , b);
		
		int func6 = func3 - func5;
		int func7 = (int) Math.pow(func6 / g, c);
		
		System.out.println(func1);
		System.out.println(func2);
		System.out.println(func3);
		System.out.println(func4);
		System.out.println(func5);
		System.out.println(func6);
		System.out.println(func7);
		
/*		
		//1
		int func1 = e * (c + b);
		int func2 = (int) Math.pow(func1, b);
		int func3 = c * b;
		int resulFunc1 = func2 / func3;
		
		//2
		int func4 = a - d;
		int func5 = b - f;
		int func6 = func4 * func5;
		int func7 = func6 / b;
		int resulFunc2 = (int) Math.pow(func7, b);
		
		//3
		int resulFunc3 = resulFunc1 - resulFunc2;
				
		//4
		int resulFunc4 = (int) Math.pow(resulFunc3, c);
		int resulFunc5 = (int) Math.pow(g, c);
				
		//5
		int resulFunc6 = resulFunc4 / resulFunc5;
		
		System.out.println(resulFunc1);
		System.out.println(resulFunc2);
		System.out.println(resulFunc3);
		System.out.println(resulFunc4);
		System.out.println(resulFunc5);
		System.out.println(resulFunc6);
		
*/
		
				
	}
}
