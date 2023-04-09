
public class PilhaEstatica{
	
	private float[] elementos;
	private int topo;
	
	PilhaEstatica(int tamanho){
		this.elementos = new float[tamanho];
		this.topo = 0;
	}
	
	public boolean isFull() {
		return this.topo == this.elementos.length;
	}
	
	public boolean isEmpty() {
		return this.topo == 0;
	}
	
	public boolean empilhar(Float valor) {
		if(!this.isFull()) {
			elementos[topo] = valor;
			topo++;
			return true;
		}
		return false;
	}
	
	public float desempilhar() throws PilhaException {
		if(!this.isEmpty()) {
			topo--;
			return elementos[topo];
		}
		throw new PilhaException("Topo nulo");
	}
	
	public float mostrarTopo() throws PilhaException{
		if(this.isEmpty()) {
			throw new PilhaException("Topo nulo");
		}
		return elementos[topo-1];
	}
	
}
