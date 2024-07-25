package entidades.distribuicoes.concretes;

import entidades.distribuicoes.abstracts.DistribuicoesLambda;
import entidades.extras.Fatorial;



public class DistribuicaoPoisson extends DistribuicoesLambda {
	
	private int valor_lambda; 

	
	public DistribuicaoPoisson(int lambda){
		this.valor_lambda = lambda;
	}
	@Override
	public Double calcular(Integer x) {
		Double numerador = Math.pow(valor_lambda, x) * Math.exp(-valor_lambda);
		Long denominador = Fatorial.calculaFatorial(x); 
		return numerador / denominador; 
	}

}
