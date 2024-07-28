package entidades.distribuicoes.concretes;

import entidades.distribuicoes.abstracts.DistribuicoesDominioReal;

public class DistribuicaoNormal extends DistribuicoesDominioReal{
    private Integer media;
    private Integer desvioPadrao;

    public DistribuicaoNormal(int media, int desvioPadrao){
        this.media = media;
        this.desvioPadrao = desvioPadrao;
    }

    public Double calcMedia(){
        return (double) media;
    }

    public Double calcVariancia(){
        return Math.pow(desvioPadrao, 2);
    }

    public Double calcular(Integer x){
        return (1 / (desvioPadrao * Math.sqrt(2 * Math.PI))) * Math.exp(-Math.pow(x - media, 2) / (2 * Math.pow(desvioPadrao, 2)));
    }
}