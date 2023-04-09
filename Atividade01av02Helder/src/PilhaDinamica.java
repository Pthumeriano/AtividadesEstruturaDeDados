
public class PilhaDinamica {
	
	private class Node{
		private Node proximo;
		private float valor;
		
		Node(float valor){
			this.setValor(valor);
			this.proximo = null;
		}

		public float getValor() {
			return valor;
		}

		public void setValor(float valor) {
			this.valor = valor;
		}
	}
	
	private Node topo;
	private int tamanho;
	
	public PilhaDinamica() {
		this.tamanho = 0;
		this.topo = null;
	}
	
	public int getSize() {
		return this.tamanho;
	}
	
	public boolean isEmpty() {
		return this.tamanho == 0;
	}
	
	public void empilhar(float valor) {
		Node novo = new Node(valor);
		novo.proximo = this.topo;
		this.topo = novo;
		tamanho++;
	}
	
	public float desempilhar() throws PilhaException{
		if(this.isEmpty()) {
			throw new PilhaException("Topo nulo");
		}
		float desempilhado = this.topo.getValor();
		this.topo = this.topo.proximo;
		tamanho--;
		return desempilhado;
	}
	
	public float mostrarTopo() throws PilhaException{
		if(this.isEmpty()) {
			throw new PilhaException("Topo nulo");
		}
		return this.topo.getValor();
	}
	
	public void esvaziar() throws PilhaException {
		while(this.tamanho != 0) {
				this.desempilhar();

		}
	}

}
