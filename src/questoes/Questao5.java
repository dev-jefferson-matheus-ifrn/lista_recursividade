package questoes;

/*5. A multiplicação de dois números inteiros 
 * pode ser feita através de somas sucessivas. Proponha um
algoritmo recursivo multiplicação(n1, n2) que 
calcule a multiplicação de dois inteiros.*/
public class Questao5 {

	public static int multiply(int n1, int n2) {
		if (n2 == 1) {
			return n1;
		}

		if (n2 == 0) {
			return 0;
		}

		if (n2 < 0) {
			return -multiply(n1, -n2);
		}

		return n1 + multiply(n1, n2 - 1);

	}
}
