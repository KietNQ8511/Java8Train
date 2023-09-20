package function__interface.predicate;

import java.util.function.Predicate;

/**
 * 
 * @author kietnq
 *
 */
public class PredicateChaining {

	/**
	 * Predicate Chaining
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Predicate<Integer> greaterThanTen = (i) -> i > 10;
		
		// create predicate
		Predicate<Integer> lowerThanTwenty = i -> i < 20;
		
		
		// And() method of predicate
		boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
		
		System.out.println(result);
		
		// Negate () method of predicate
		/**
		 *  used to negative of that predicate
		 *  ex: predicate before return true than 
		 */
		boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(0);
		System.out.println(result2);
		
		
	}
}
