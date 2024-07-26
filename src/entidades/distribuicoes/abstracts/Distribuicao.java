package entidades.distribuicoes.abstracts;
import java.util.ArrayList;

public interface Distribuicao {
	public abstract Double calcular(Integer x); //método que calcula a função da distribuição

	public abstract ArrayList<Double> gerarValores(Integer numero);
}
