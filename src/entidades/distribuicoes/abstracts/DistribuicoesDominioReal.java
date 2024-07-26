package entidades.distribuicoes.abstracts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public abstract class DistribuicoesDominioReal implements Distribuicao {
    public ArrayList<Double> gerarValores(Integer numero){
        ArrayList<Double> valoresDeRetorno = new ArrayList<>();
        ArrayList<Integer> valoresAleatorios = new ArrayList<>();

        Random rand = new Random();
        for(int i = 0; i < numero; i++){
            valoresAleatorios.add(rand.nextInt(2 + 2 +1) - 2);
        }

        Collections.sort(valoresAleatorios);

        for (Integer e : valoresAleatorios) {
            valoresDeRetorno.add(calcular(e));
        }

        return valoresDeRetorno;
    }
}
