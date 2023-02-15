package guessingNumbers;

// FindNumber - Numara Bulma uygulaması

public class Main {
	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,3,4,5,6,7};
		int sought = 4 ;
		boolean isThere = false;
		for(int number : numbers) {
			if(number == sought) {
				isThere = true;
				break;
			}
		}
		if(isThere) {
			System.out.println("Number found");
		}
		else {
			System.out.println("Number is not found");
		}
	}
}
