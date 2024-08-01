package entidades.distribuicoes.concretes;

import entidades.distribuicoes.abstracts.DistribuicoesDominioReal;

public class DistribuicaoUniforme extends DistribuicoesDominioReal {
    private Integer lim_inf;
    private Integer lim_sup;

    public DistribuicaoUniforme(Integer a, Integer b) {
        this.lim_inf = a;
        this.lim_sup = b;
    }

    public Double calcular(Integer x) {
        if (x < lim_inf | x > lim_sup) {
            return 0.0;
        }
        return (double) 1 / (lim_sup - lim_inf);
    }

    public Double calcMedia() {
        return (double) (lim_inf + lim_sup) / 2;
    }

    public Double calcVariancia() {
        return (Math.pow(lim_sup - lim_inf, 2)) / 12;
    }
}
