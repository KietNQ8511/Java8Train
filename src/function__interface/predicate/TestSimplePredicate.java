package function__interface.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestSimplePredicate {

	/**
	 * Predicate have to return type boolean
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// create predicate
		Predicate<Integer> lessthan = (i) -> (i < 18);

		// Calling predicate method
		System.out.println(lessthan.test(10));

		// create predicate compare each age with 18
		Predicate<List<Integer>> lessThan18List = list -> {
			for (Integer number : list) {
				if (number < 18)
					System.out.print(false + " ");
				else
					System.out.print(true + " ");
			}
			return false;
		};
		
		List<Integer> listInteger = new ArrayList<>() {{
			add(19);
			add(16);
			add(25);
		}};
		
		lessThan18List.test(listInteger);
	}
}
