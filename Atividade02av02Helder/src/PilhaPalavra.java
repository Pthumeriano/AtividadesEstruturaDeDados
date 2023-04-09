
public class PilhaPalavra {
	private class Node{
		private Node proximo;
		private char letra;
		
		Node(char letra){
			this.letra = letra;
			this.proximo = null;
		}
		
		public char getLetra() {
			return this.letra;
		}
	}
	
	private int tamanho;
	private Node topo;
	
	public PilhaPalavra() {
		this.tamanho = 0;
		this.topo = null;
	}
	
	public boolean isEmpty() {
		return this.tamanho == 0;
	}
	
	public void empilhar(char letra) {
		Node novo = new Node(letra);
		novo.proximo = this.topo;
		this.topo = novo;
		tamanho++;
	}
	
	public char desempilhar() {
		if(!this.isEmpty()) {
			char letra = this.topo.getLetra();
			this.topo = this.topo.proximo;
			tamanho--;
			return letra;
		}
		return 0;
	}
	
	public void preencher(String palavra) {
		for(int i=0; i<palavra.length(); i++){
			this.empilhar(palavra.charAt(i));
		}
	}
	
	public char mostrarTopo() {
		if(!this.isEmpty()) {
			return this.topo.getLetra();
		}
		return 0;
	}
	
	public void mostrarPilhaCompleta() {
		PilhaPalavra temp = this;
		while(!temp.isEmpty()) {
			System.out.println(this.desempilhar());
		}
	}
	
	public PilhaPalavra inverter() {
		PilhaPalavra temp = new PilhaPalavra();
		
		while(!this.isEmpty()) {
			temp.empilhar(this.desempilhar());
		}
		
		return temp;
	}
	
	public boolean equals(PilhaPalavra pilha) {
		
		if(this.tamanho != pilha.tamanho) {
			return false;
		}
		
		while(!pilha.isEmpty()) {
			if(pilha.desempilhar() != this.desempilhar()) {
				return false;
			}
		}
		
		return true;
	}
	
	public boolean checarPalindromo(String palavra) {
		PilhaPalavra temp = new PilhaPalavra();
		temp.preencher(palavra);
		
		PilhaPalavra temp2 = new PilhaPalavra();
		temp2 = temp.inverter();
		
		temp.preencher(palavra);
		
		return temp.equals(temp2);
	}
	
}
