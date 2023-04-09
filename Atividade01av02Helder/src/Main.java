import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PilhaEstatica p1 = new PilhaEstatica(3);
		PilhaDinamica p2 = new PilhaDinamica();
		
		Scanner ler = new Scanner(System.in);
		
		//vvvv Teste pilha estática vvvv
		System.out.println("Iniciando teste da pilha estática");
		System.out.println();
		System.out.println();
		
		int sairp1 = -1;
		while(sairp1 != 4) {
			System.out.println("1 - Mostrar topo");
			System.out.println("2 - Empilhar");
			System.out.println("3 - Desmpilhar");
			System.out.println("4 - Sair");
			
			sairp1 = ler.nextInt();
			
			switch(sairp1) {
			case 1:
				try {
					System.out.println(p1.mostrarTopo	());
				} catch (PilhaException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				System.out.println("Digite um numero");
				try {
					float valor = ler.nextFloat();
					p1.empilhar(valor);
				} catch (Exception e) {
					System.out.println("Valor invalido");
				}
				break;
			case 3:
				try {
					System.out.println("Desempilhando valor: " + p1.desempilhar());
				} catch (PilhaException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			
			case 4:
				System.out.println("Encerrando teste pilha estatica...");
				break;
			}
		}
		//^^^^ Teste pilha estática ^^^^
		
		
		
		
		//vvvv Teste pilha dinâmica vvvv
		System.out.println("Iniciando teste da pilha dinâmica");
		System.out.println();
		System.out.println();
		
		int sairp2 = -1;
		
		while(sairp2 != 6) {
			System.out.println("1 - Mostrar topo");
			System.out.println("2 - Empilhar");
			System.out.println("3 - Desempilhar");
			System.out.println("4 - Mostar tamanho");
			System.out.println("5 - Esvaziar");
			System.out.println("6 - Sair");
			
			sairp2 = ler.nextInt();
			
			switch(sairp2) {
			case 1:
				try {
					System.out.println(p2.mostrarTopo());
				} catch (PilhaException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				System.out.println("Digite um numero");
				try {
					float valor = ler.nextFloat();
					p2.empilhar(valor);
				} catch (Exception e) {
					System.out.println("Valor invalido");
				}
				break;
			case 3:
				try {
					System.out.println("Desempilhando valor: " + p2.desempilhar());
				} catch (PilhaException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case 4:
				System.out.println("Tamanho atual: " + p2.getSize());
				break;
			
			case 5:
				try {
					p2.esvaziar();
				} catch (PilhaException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			
			case 6:
				System.out.println("Encerrando teste da pilha dinâmica...");
				break;
			}
			
			
		}
		//^^^^ Teste pilha dinâmica
		
		ler.close();
		
	}

}
