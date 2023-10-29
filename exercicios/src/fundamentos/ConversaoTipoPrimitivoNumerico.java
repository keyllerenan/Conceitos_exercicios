package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1; //Implícita
		System.out.println(a);
		
		float b = (float) 1.12345678; //explícita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; //explícita (CAST)
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e; //Explícita
		System.out.println(f);
		
	}
}
