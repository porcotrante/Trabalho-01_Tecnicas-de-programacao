package entidades.distribuicoes.concretes;

import entidades.distribuicoes.abstracts.DistribuicoesDominioReal;

public class DistribuicaoNormal extends DistribuicoesDominioReal{
    private Integer media;
    private Integer desvioPadrao;

    public DistribuicaoNormal(int media, int desvioPadrao){
        this.media = media;
        this.desvioPadrao = desvioPadrao;
    }

    public Integer getMedia(){
        return media;
    }

    public Integer getDesvio(){
        return desvioPadrao;
    }

    public Double calcular(Integer x){
        return (1 / (desvioPadrao * Math.sqrt(2 * Math.PI))) * Math.exp(-Math.pow(x - media, 2) / (2 * Math.pow(desvioPadrao, 2)));
    }
}