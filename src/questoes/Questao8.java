package questoes;

/*8. Implemente uma função recursiva para dizer se uma palavra é palíndroma.*/

public class Questao8 {

	public static boolean isPalindrome(String word, int inicial, int end) {

		if (inicial == end) {
			return true;
		}

		if (word.toLowerCase().charAt(inicial) != word.toLowerCase().charAt(end)) {
			return false;
		}

		return isPalindrome(word, inicial + 1, end - 1);

	}
}
