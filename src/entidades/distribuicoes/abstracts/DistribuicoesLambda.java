package entidades.distribuicoes.abstracts;

public abstract class DistribuicoesLambda extends DistribuicoesDominioReal {
   private Integer lambda;

   public Integer getLambda(){
      return lambda;
   }

   public void setLambda(Integer lambda){
      this.lambda = lambda;
   }  
}
