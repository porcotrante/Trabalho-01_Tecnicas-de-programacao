package entidades.extras;
import java.util.HashMap;
import java.util.Map;


public class Fatorial {

    private static Map<Integer, Long> memoria = new HashMap<>();
	 
	public static Long calculaFatorial(int x) {
		if( x == 0 || x == 1) {
			return (long) 1; 
		}
		if (memoria.containsKey(x)) {
			return memoria.get(x);
		}
	
		Long resultado = x * calculaFatorial(x - 1);
		memoria.put(x, resultado);
		return resultado;
	}
			
}
