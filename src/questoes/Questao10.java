package questoes;

/*10. Implemente uma função recursiva buscaBinaria(vetor, inicio, fim, alvo) que encontre o índice de um
elemento em um vetor já ordenado. Se o elemento não existir, a função deve retornar -1. A lógica
consiste em verificar o elemento do meio: (i) Se for o alvo, terminamos. (ii) Se o alvo for menor,
buscamos apenas na metade esquerda. (iii) Se o alvo for maior, buscamos apenas na metade direita.*/
public class Questao10 {

	public static int binarySearch(int[] array, int inicial, int end, int target) {
		if (end >= inicial) {
			int middle = inicial + (end - inicial) / 2;

			if (array[middle] == target) {
				return array[middle];
			}

			if (array[middle] < target) {
				return binarySearch(array, middle + 1, end, target);
			}

			if (array[middle] > target) {

				return binarySearch(array, inicial, middle - 1, target);
			}
		}

		return -1;
	}
}
