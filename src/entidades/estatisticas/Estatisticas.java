package entidades.estatisticas;

import entidades.distribuicoes.abstracts.Distribuicao;

public class Estatisticas<D> {
    D dist;

    public Estatisticas(D dist){
        this.dist = dist;
    }

    public void imprimirValoresGerados(int numeroDeValores){
        System.err.printf("Valores: ");
        for (Double e : ((Distribuicao)dist).gerarValores(numeroDeValores)) {
            System.out.printf("%.2f, ", e);
        }
    }

    public void imprimirMedia(){
        System.out.print("\n");
        if (dist instanceof Distribuicao) {
            System.out.printf("Média: %.1f\n", ((Distribuicao)dist).calcMedia());
        }

        else {
            System.out.println("Erro, média não encontrada");
        }
    }

    public void imprimirVariancia(){
        if (dist instanceof Distribuicao) {
            System.out.printf("Variancia: %.1f\n", ((Distribuicao)dist).calcVariancia());
        }

        else {
            System.out.println("Erro, variância não encontrada");
        }
    }
}