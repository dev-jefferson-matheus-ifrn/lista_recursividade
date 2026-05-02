package questoes;

/*
 * Crie uma função potencia(base, expoente) usando apenas multiplicações
 * recursivas.
 */
public class Questao3 {

	public static int power(int base, int exponent) {

		if (exponent == 0) {
			return 1;
		} else {
			return base * power(base, exponent - 1);
		}
	}
}
