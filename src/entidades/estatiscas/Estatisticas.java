package entidades.estatiscas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import entidades.distribuicoes.abstracts.Distribuicao;
import entidades.distribuicoes.concretes.DistribuicaoNormal;
import entidades.distribuicoes.concretes.DistribuicaoUniforme;
import entidades.distribuicoes.concretes.DistribuicaoPoisson;

public class Estatisticas<D> {
    D dist;
    ArrayList<Integer> sequencia;
    Double media;
    Double variancia;

    public Estatisticas(D dist){
        this.dist = dist;
        this.sequencia = new ArrayList<>();
    }

    public void imprimirValoresGerados(int numeroDeValores){
        Random rand = new Random();

        if (dist instanceof DistribuicaoNormal || dist instanceof DistribuicaoUniforme) {
            //para funções cujo domínio permite, o valores gerado são no range de -2 a 2
            for(int i = 0; i < numeroDeValores; i++){
                int value = rand.nextInt(2 + 2 + 1) - 2;
                sequencia.add(value);
            }
        }

        else{
            for(int i = 0; i < numeroDeValores; i++){
                int value = rand.nextInt(2);
                sequencia.add(value);
            }
        }

        Collections.sort(sequencia);

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
        else{
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
            System.out.printf("Variância: %d", ((DistribuicaoPoisson)dist).getLambda());
        }
        else{
            System.out.println("Erro, variância não encontrada");
        }
    }
}