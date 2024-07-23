package entidades.estatiscas;
import java.util.ArrayList;
import java.util.Random;

import entidades.distribuicoes.abstracts.Distribuicao;

public class Estatisticas<D> {
    D dist;
    ArrayList<Double> sequencia;
    Double media;
    Double variancia;

    public Estatisticas(D dist){
        this.dist = dist;
        this.sequencia = new ArrayList<>();
    }

    public void imprimirValoresGerados(int numeroDeValores){
        Random rand = new Random();

        for(int i = 0; i < numeroDeValores; i++){
            sequencia.add(((Distribuicao)dist).calcular(rand.nextInt(5)));
        }

        for (Double e : sequencia) {
            System.out.printf("%.3f\n", e);
        }
    }

    void imprimirMedia(){
        //TODO método que calcula (se necessário) e imprime a média baseada na sequencia
    }

    void imprimirVariancia(){
        //TODO método que calcula (se necessário) e imprime a variancia baseada na sequencia
    }
}