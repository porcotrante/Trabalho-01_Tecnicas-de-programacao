package entidades.distribuicoes.concretes;

import entidades.distribuicoes.abstracts.Distribuicao;

public class DistribuicaoUniforme implements Distribuicao {
    private Integer lim_inf;
    private Integer lim_sup;

    public DistribuicaoUniforme(Integer a, Integer b) {
        this.lim_inf = a;
        this.lim_sup = b;
    }

    public Integer getLimitA(){
        return lim_inf;
    }

    public Integer getLimitB(){
        return lim_sup;
    }

    public Double calcular(Integer x) {
        if (x < lim_inf | x > lim_sup) {
            return 0.0;
        }
        return (double)(1 / (lim_sup - lim_inf));
    }
}