package entidades.estatiscas;
import java.util.List;

public class Estatisticas<D> {
    D dist;
    List<Double> sequencia;
    Double media;
    Double variancia;

    Estatisticas(D dist){
        this.dist = dist;
    }

    void imprimirValoresGerados(int numberOfValues){
        //TODO método que gera a sequência, a imprime e a guarda no campo sequencia
    }

    void imprimirMedia(){
        //TODO método que calcula (se necessário) e imprime a média baseada na sequencia
    }

    void imprimirVariancia(){
        //TODO método que calcula (se necessário) e imprime a variancia baseada na sequencia
    }
}