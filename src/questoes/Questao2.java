package questoes;

/*
 * Implemente uma função recursiva contagemRegressiva(n) que imprime no console
 * uma contagem de n até 0.
 */
public class Questao2 {

	public static int countdown(int n) {

		if (n == 0) {
			return n;
		} else {
			System.out.println("Contagem regresiva: " + n);
			return countdown(n - 1);
		}

	}
}
