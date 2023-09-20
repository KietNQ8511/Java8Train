package function__interface.predicate;

import java.util.function.Predicate;

public class PredicateIntoFunction {

	// Pass predicate as parameter
	static void pred(int number, Predicate<Integer> predicate) {
		if (predicate.test(number)) {
			System.out.println("number : " + number);
		}
	}

	public static void main(String[] args) {

		// [ (i) -> i > 7 ] is predicate
		pred(10, (i) -> i > 7);
	}
}
