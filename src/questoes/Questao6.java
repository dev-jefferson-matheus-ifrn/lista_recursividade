package questoes;

/*
 * 6. Implemente uma função recursiva para converter 
 * um número natural em base
 * binária.
 */
public class Questao6 {

	public static int convertToBinary(int n) {

		if (n == 0) {
			return 0;
		} else {

			return (n * 2 + 10 * convertToBinary(n / 2));
		}

	}

}
