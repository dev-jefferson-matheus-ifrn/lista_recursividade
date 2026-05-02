package questoes;

/*
 * Implemente uma função recursiva que permita somar os elementos de um vetor de
 * inteiros.
 */
public class Questao1 {
	public static int sumElementsRecursive(int qtdElements, int[] arrayElements) {
		if (qtdElements == 0) {
			return 0;
		} else {
			return arrayElements[qtdElements - 1] + sumElementsRecursive(qtdElements - 1, arrayElements);
		}
	}

}
