package entidades.distribuicoes.concretes;

import entidades.distribuicoes.abstracts.DistribuicoesLambda;

public class DistribuicaoExponencial extends DistribuicoesLambda {

    public DistribuicaoExponencial (Integer lambda) {

        super.setLambda(lambda);

    }
    
    public Double calcular (Integer x) {

        if (x >= 0) {
            Integer lambda = super.getLambda();
            return (lambda * Math.exp(- lambda * x));

        } else {

            return 0.0;

        }
    }
}

