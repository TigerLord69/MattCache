package alphabet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alphabet {
	List<Letter> myLetters;
	
	Alphabet() {
		myLetters = new ArrayList<>();
		myLetters.add(new Letter("ay", 'a', this));
		myLetters.add(new Letter("bee", 'b', this));
		myLetters.add(new Letter("see", 'c', this));
		myLetters.add(new Letter("dee", 'd', this));
		myLetters.add(new Letter("ee", 'e', this));
		myLetters.add(new Letter("eff", 'f', this));
		myLetters.add(new Letter("djee", 'g', this));
		myLetters.add(new Letter("aich", 'h', this));
		myLetters.add(new Letter("aye", 'i', this));
		myLetters.add(new Letter("jay", 'j', this));
		myLetters.add(new Letter("kay", 'k', this));
		myLetters.add(new Letter("el", 'l', this));
		myLetters.add(new Letter("em", 'm', this));
		myLetters.add(new Letter("en", 'n', this));
		myLetters.add(new Letter("oh", 'o', this));
		myLetters.add(new Letter("pee", 'p', this));
		myLetters.add(new Letter("kew", 'q', this));
		myLetters.add(new Letter("arr", 'r', this));
		myLetters.add(new Letter("ess", 's', this));
		myLetters.add(new Letter("tee", 't', this));
		myLetters.add(new Letter("you", 'u', this));
		myLetters.add(new Letter("vee", 'v', this));
		myLetters.add(new Letter("double you", 'w', this));
		myLetters.add(new Letter("ex", 'x', this));
		myLetters.add(new Letter("wye", 'y', this));
		myLetters.add(new Letter("zee", 'z', this));
	}
	
	public String toString() {
		String toReturn = "";
		for (Letter i: myLetters) {
			toReturn += i + "\n";
		}
		return toReturn;
	}
	
	public void sort() {
		Collections.sort(myLetters);
	}
	
	public int determineRank(char aChar) {
		int i = 0;
		for (Letter l: myLetters) {
			if (l.letter == aChar) {
				return i;
			}
			i++;
		}
		return 0;
	}
}
