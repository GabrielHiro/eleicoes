package elecoes;

import java.util.Scanner; //import do Scanner

public class elecoes {

	@SuppressWarnings({ "resource", "unused" }) //suprimir ou ignorar avisos do compilador 
	public static void main(String[] args) {
		// Novo Scanner: "ler"
		
		Scanner ler = new Scanner(System.in);
		
		//variaveis
		
		int votos;//contagem dos votos
		
		int conte;// contagem do for
		
		int pt = 0, pdt = 0, pl = 0, psdb = 0, nulo = 0, branco = 0;//Contagem dos votoss dos ( Partidos / nulo / branco )
		
		//For | Para fazer o loop até 50 votos
		
		for (conte = 0; conte < 50; conte++) {
			System.out.print("\n\n ESCOLHA SEU VOTO: \n 1 - (13) PT \n 2 - (12) PDT \n 3 - (22) PL \n 4 - (45) PSDB \n 5 - voto nulo \n 6 - voto em branco \n\n DIGITE O SOMENTE NUMERO \n DIGITE AQUI:  "); //Print da pergunta
			votos = ler.nextInt();//scanner
			
			//Switch (votos)
			switch (votos) {
				// caso (n) ele ira mostrar a mensagem de que votou e adicionara na variavel +1 voto 
				case 1: {
					System.out.print("\n VOCÊ VOTOU NO (13) PT"); // aviso em qual foi o voto
					pt++; //adicionado +1 na variavel/voto
					break;
				}
				case 2: {
					System.out.print("\n VOCÊ VOTOU NO (12) PDT");// aviso em qual foi o voto
					pdt++;//adicionado +1 na variavel/voto
					break;
				}
				case 3: {
					System.out.print("\n VOCÊ VOTOU NO (22) PL");// aviso em qual foi o voto
					pl++;//adicionado +1 na variavel/voto
					break;
				}
				case 4: {
					System.out.print("\n VOCÊ VOTOU NO (45) PSDB");// aviso em qual foi o voto
					psdb++;//adicionado +1 na variavel/voto
					break;
				}
				case 5: {
					System.out.print("\n VOCÊ VOTOU NULO");// aviso em qual foi o voto
					nulo++;//adicionado +1 na variavel/voto
					break;
				}
				case 6: {
					System.out.print("\n VOCÊ VOTOU EM BRANCO");// aviso em qual foi o voto
					branco++;//adicionado +1 na variavel/voto
					break;
				}
				}
		}
		
		//quando terminar o loop, demonstra um print de totais de votos
		System.out.printf("\n\n TOTAL DE VOTOS: \n (13) PT = %d \n (12) PDT = %d \n (22) PL = %d \n (45) PSDB = %d \n\n NULOS: %d \n BRANCOS: %d", pt, pdt, pl, psdb, nulo, branco);
		
}
}