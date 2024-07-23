package entidades.distribuicoes.concretes;

import entidades.distribuicoes.abstracts.Distribuicao;

public class DistribuicaoUniforme implements Distribuicao {
    private Double lim_inf;
    private Double lim_sup;

    public DistribuicaoUniforme(double a, double b) {
        this.lim_inf = a;
        this.lim_sup = b;
    }

    public Double calcular(Integer x) {
        if (x < lim_inf | x > lim_sup) {
            return 0.0;
        }
        return (1 / (lim_sup - lim_inf));
    }
}