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

		Integer abs_x = Math.abs(x);
		
		Double numerador = Math.pow(lambda, abs_x) * Math.exp(-lambda);
		Long denominador = Fatorial.calculaFatorial(abs_x); 
		return numerador / denominador; 
	}

	public Double calcMedia() {
		return (double) super.getLambda();
	}

	public Double calcVariancia() {
		return (double) super.getLambda();
	}

}
