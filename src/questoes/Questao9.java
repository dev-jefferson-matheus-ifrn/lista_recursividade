package questoes;

import java.util.Hashtable;

/*9. Pesquise como se pode desenvolver uma função de Fibonacci 
 * recursiva que seja eficiente e implemente essa solução.*/

public class Questao9 {
	
	public static long fibonacci(int n, Hashtable<Integer, Long> memo) {
		
		if(n <= 1) {
			return n;
		}
		
		if(memo.containsKey(n)) {
			return (long) memo.get(n);
		}
		
		long result = fibonacci(n - 1, memo) + fibonacci(n - 2,memo);
		
		memo.put(n, result);
		
		return result;
	}
}
