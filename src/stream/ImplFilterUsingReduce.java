package stream;

import java.util.ArrayList;
import java.util.List;

public class ImplFilterUsingReduce {
	/**
	 * Many times. we need to perform operations where a stream reduces to a single resultant value, 
	 * for example, maximum, minimum, sum, product, etc.
	 * Reducing is the repeated process of combining all elements.
	 * reduce operation applies a binary operator to each element in the stream where the first argument to
	 * the operator is the return value of the previous application and the second argument is the current stream element.
	 * In
	 */
	
	List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7);
	
//	List<Integer> even = arr.stream().reduce(new ArrayList<Integer>(), )
}
