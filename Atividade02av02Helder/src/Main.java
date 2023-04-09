import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		PilhaPalavra pilha1 = new PilhaPalavra();
		PilhaPalavra pilha2 = new PilhaPalavra();
		
		Scanner ler = new Scanner(System.in);
		
		int teste = -1;
		while(teste != 9) {
			int opcao = -1;
			char letra = 0;
			String palavra = "";
			
			System.out.println("---- TESTE PALÍNDROMO COM PILHA DINÂMICA----");
			System.out.println("1 - Mostrar topo");
			System.out.println("2 - Empilhar");
			System.out.println("3 - Desempilhar");
			System.out.println("4 - Preencher com palavra");
			System.out.println("5 - Inverter");
			System.out.println("6 - Mostrar pilha completa (será esvaziada)");
			System.out.println("7 - Checar palíndromo (utiliza pilhas temporarias)");
			System.out.println("8 - Comparar pilha 1 e 2 (serão esvaziadas)");
			System.out.println("9 - Sair");
			
			teste = ler.nextInt();
			switch(teste) {
			
			case 1:
				
				System.out.println("Qual pilha? (1 ou 2)");
				opcao = ler.nextInt();
				
				if(opcao == 1) {
					System.out.println(pilha1.mostrarTopo());
				}else if(opcao == 2) {
					System.out.println(pilha2.mostrarTopo());
				}else {
					System.out.println("Opcao invalida");
				}
				
				break;
				
			case 2:
				
				System.out.println("Qual pilha? (1 ou 2)");
				opcao = ler.nextInt();
				
				if(opcao == 1) {
					System.out.println("Digite UMA letra para empilhar na pilha 1: ");
					letra = ler.next().charAt(0);
					pilha1.empilhar(letra);
					
				}else if(opcao == 2) {
					System.out.println("Digite UMA letra para empilhar na pilha 2: ");
					letra = ler.next().charAt(0);
					pilha2.empilhar(letra);
				}else {
					System.out.println("Opcao invalida");
				}
				
				break;
				
			case 3:
				
				System.out.println("Qual pilha? (1 ou 2)");
				opcao = ler.nextInt();
				System.out.println("Desempilhando...");
				if(opcao == 1) {
					pilha1.desempilhar();
					
				}else if(opcao == 2) {
					pilha2.desempilhar();
				}else {
					System.out.println("Opcao invalida");
				}
				
				break;
				
			case 4:
				
				System.out.println("Qual pilha? (1 ou 2)");
				opcao = ler.nextInt();
				
				if(opcao == 1) {
					System.out.println("Digite UMA palavra para preencher na pilha 1: ");
					palavra = ler.next();
					pilha1.preencher(palavra);
					
				}else if(opcao == 2) {
					System.out.println("Digite UMA palavra para preencher na pilha 2: ");
					palavra = ler.next();
					pilha2.preencher(palavra);
				}else {
					System.out.println("Opcao invalida");
				}
				
				break;
								
				
			case 5:
				
				System.out.println("Qual pilha? (1 ou 2)");
				opcao = ler.nextInt();
				
				if(opcao == 1) {
					pilha1 = pilha1.inverter();
				}else if(opcao == 2) {
					pilha2 = pilha2.inverter();
				}else {
					System.out.println("Opcao invalida");
				}
				
				break;
				
			case 6:
				
				System.out.println("Qual pilha? (1 ou 2)");
				opcao = ler.nextInt();
				
				if(opcao == 1) {
					pilha1.mostrarPilhaCompleta();
				}else if(opcao == 2) {
					pilha2.mostrarPilhaCompleta();
				}else {
					System.out.println("Opcao invalida");
				}
				
				break;
				
			case 7:
				
				System.out.println("Digite UMA palavra: ");
				palavra = ler.next();
				
				PilhaPalavra temp = new PilhaPalavra();
				System.out.println(temp.checarPalindromo(palavra));
				
				break;
			
			case 8:
				System.out.println("Igualdade: " + pilha1.equals(pilha2));
				break;
				
			case 9:
				System.out.println("Saindo...");
				break;
			}
			
		}
		ler.close();

		}
	
}
