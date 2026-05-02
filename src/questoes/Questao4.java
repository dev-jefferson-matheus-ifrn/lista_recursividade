package questoes;
/*
 * Implemente uma função recursiva que receba um número inteiro positivo n e
 * calcule o somatório dos números de 1 a n.
 */
public class Questao4 {

	public static int somatory(int n) {
		
		if(n == 0) {
			return n;
		}else {
			return n + somatory(n - 1);
		}
	}
}
