package controle;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
//		Switch: Ele recebe um valor diferete do if/for/while.
	
//		Switch com Break
	int idade = 3;
	
	switch (idade) {
	case 3:
		System.out.println("Sabe programar");
	case 2:
		System.out.println("Sabe falar");
	case 1:
		System.out.println("Sabe andar");
	case 0:
		System.out.println("Sabe respirar\n");
	}
			
	String faixa = "marrom";
	
	switch (faixa.toLowerCase()) {
	case "preta":
		System.out.println("Sei o Bassai-Dai...");
	case "marrom":
		System.out.println("Tekki Shodan");
	case "roxa":
		System.out.println("Heian Godan");
	case "verde":
		System.out.println("Heian Yodan");
	case "laranja":
		System.out.println("Heian Sandan");
	case "vermelha":
		System.out.println("Heian Nidan");
	case "amarela":
		System.out.println("Heian Shodan");
		break;
			default:
				System.out.println("Não sei de nada.");			
	}
	
	System.out.println("Fim.");
	
	
	}
}
