package entidades;
import java.util.ArrayList;

public abstract class Distribuicao {
	
	public ArrayList<Object> sequencia;
	public Double media;
	public Double variancia;
	public Double desvio_p;
	
	public Distribuicao(ArrayList<Object> dist) {
		this.sequencia = dist; // não é necessário usar o método clone(), o array não será alterado
							  // Podemos alterar em um método futuro de sort
	}
	
	public abstract void sort();

	public abstract Double getMedia();
	
	public abstract Double getVariancia();
	
	public abstract Double getDesvioP();
}
