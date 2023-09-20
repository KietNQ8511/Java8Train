package function__interface.predicate;

import java.util.function.Predicate;

public class PredicateOR {
	static Predicate<String> hasLengthOf10 = new Predicate<String>() {
		public boolean test(String t) {
			return t.length() > 10;
		};
	};
	
	static void predicate_or () {
		Predicate<String> containsLetterA = p -> p.contains("A");
		String containsA = "jjfhsjdfssj";
		boolean outcome = hasLengthOf10.or(containsLetterA).test(containsA);
		
		System.out.println(outcome);
	}
	
	public static void main(String[] args) {
		predicate_or();
	}
}
