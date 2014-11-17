package alphabet;

public class Letter implements Comparable<Letter> {
	String spelling;
	
	char letter;
	
	Alphabet currentOrdering;
	
	Letter(String aSpelling, char aLetter, Alphabet anAlphabet) {
		letter = aLetter;
		spelling = aSpelling;
		currentOrdering = anAlphabet;
	}
	
	public String toString() {
		String toReturn = spelling + " " + letter;
		return toReturn;
	}

	@Override
	public int compareTo(Letter other) {
		final int BEFORE = -1;
		final int EQUAL = 0;
		final int AFTER = 1;
		for (int i = 0; i < 10; i++) {
			if (this.spelling.length() > i) {
				int thisTemp = currentOrdering.determineRank(this.spelling.charAt(i));
				if (other.spelling.length() > i) {
					int otherTemp = currentOrdering.determineRank(other.spelling.charAt(i));
					if (thisTemp != otherTemp) {
						return thisTemp - otherTemp;
					}
				}
				else {
					return AFTER;
				}
			} else  {
				if (other.spelling.length() > i) {
					return BEFORE;
				} else {
					return EQUAL;
				}
			}
		}
		return 0;
	}
}
