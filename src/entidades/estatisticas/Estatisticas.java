package entidades.estatisticas;

import entidades.distribuicoes.abstracts.Distribuicao;
import entidades.distribuicoes.concretes.DistribuicaoExponencial;
import entidades.distribuicoes.concretes.DistribuicaoNormal;
import entidades.distribuicoes.concretes.DistribuicaoUniforme;
import entidades.distribuicoes.concretes.DistribuicaoPoisson;

public class Estatisticas<D> {
    D dist;

    public Estatisticas(D dist){
        this.dist = dist;
    }

    public void imprimirValoresGerados(int numeroDeValores){
        for (Double e : ((Distribuicao)dist).gerarValores(numeroDeValores)) {
            System.out.printf("%.2f, ", e);
        }
    }

    public void imprimirMedia(){
        //TODO método que calcula (se necessário) e imprime a média baseada na sequencia
        System.out.print("\n");
        if (dist instanceof DistribuicaoNormal){
            System.out.printf("Média: %d\n",((DistribuicaoNormal)dist).getMedia());
        }
        else if (dist instanceof DistribuicaoUniforme){
            double media = (((DistribuicaoUniforme)dist).getLimitA() + ((DistribuicaoUniforme)dist).getLimitB())/2;

            System.out.printf("Média: %.1f\n", media);
        }
        else if (dist instanceof DistribuicaoPoisson) {
            System.out.printf("Média: %d\n", ((DistribuicaoPoisson)dist).getLambda());
        }
        else if (dist instanceof DistribuicaoExponencial) {
            double l = ((DistribuicaoExponencial)dist).getLambda();

            System.out.printf("Média: %.1f\n", (1 / l));
        }

        else {
            System.out.println("Erro, média não encontrada");
        }
    }

    public void imprimirVariancia(){
        //TODO método que calcula (se necessário) e imprime a variancia baseada na sequencia
        if (dist instanceof DistribuicaoNormal){
            System.out.printf("Variância: %.1f\n" ,(Math.pow(((DistribuicaoNormal)dist).getDesvio(), 2)));
        }
        else if (dist instanceof DistribuicaoUniforme){
            double variancia = (Math.pow(((DistribuicaoUniforme)dist).getLimitA() + ((DistribuicaoUniforme)dist).getLimitB(), 0))/12;

            System.out.printf("Variância %.1f\n",variancia);
        }
        else if (dist instanceof DistribuicaoPoisson) {
            System.out.printf("Variância: %d\n", ((DistribuicaoPoisson)dist).getLambda());
        }
        else if (dist instanceof DistribuicaoExponencial) {
            double l = ((DistribuicaoExponencial)dist).getLambda();

            System.out.printf("Variância: %.1f\n", (1 / Math.pow(l,2)));
        }
        else {
            System.out.println("Erro, variância não encontrada");
        }
    }
}