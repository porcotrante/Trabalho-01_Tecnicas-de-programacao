package entidades.distribuicoes.abstracts;

public abstract class DistribuicoesLambda extends DistribuicoesDominioPositivo {
   private Integer lambda;

   public Integer getLambda(){
      return lambda;
   }

   public void setLambda(Integer lambda){
      this.lambda = lambda;
   }  
}
