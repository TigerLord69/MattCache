package alphabet;

public class Main {

	public static void main(String[] args) {
		Alphabet myAlphabet = new Alphabet();
		//System.out.println(myAlphabet);
		for (Letter l: myAlphabet.myLetters) {
			System.out.print(l.letter);
		}
		System.out.println();
		int amount = 10;
		for (int i = 0; i < amount; i++) {
			myAlphabet.sort();
			for (Letter l: myAlphabet.myLetters) {
				System.out.print(l.letter);
			}
			System.out.println();
		}
		
	}

}
