package entidades.distribuicoes.concretes;

import entidades.distribuicoes.abstracts.DistribuicoesLambda;
import entidades.extras.Fatorial;



public class DistribuicaoPoisson extends DistribuicoesLambda {

	public DistribuicaoPoisson(Integer lambda){
		super.setLambda(lambda);
	}

	@Override
	public Double calcular(Integer x) {
		Integer lambda = super.getLambda();
		
		Double numerador = Math.pow(lambda, x) * Math.exp(-lambda);
		Long denominador = Fatorial.calculaFatorial(x); 
		return numerador / denominador; 
	}

	public Double calcMedia() {
		return (double) super.getLambda();
	}

	public Double calcVariancia() {
		return (double) super.getLambda();
	}

}
