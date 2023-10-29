package fundamentos.operadores;

public class DesafiosLogicos {
	public static void main(String[] args) {
		
		// Trabalho na Terça (V ou F)
		// Trabalho na Quinta (V ou F)
		
			boolean serTerca = true;
			boolean serQuinta = false;
			
			boolean serTv32 = serTerca ^ serQuinta;
			boolean serTv50 = serTerca && serQuinta;
			boolean sorveteF = serTerca || serQuinta;
				
			System.out.println(serTv32);
			System.out.println(serTv50);
			System.out.println(sorveteF);
		
		serTerca = !true;
		System.out.println(serTerca);
	}
}
