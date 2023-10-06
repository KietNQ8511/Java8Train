package stream.ParallelSequential;

import java.util.Arrays;
import java.util.List;

/**
 * A stream in java is a sequence of object which operates on a data source such as an array or a collection and supports various method
 * Stream supports many aggregate operations like filter, map, limit, reduce, find, and match to customize the original data into a different form
 * according to the need of the programmer. The operations performed on a stream do not modify its source hence a new stream is created
 * according to the operation applied to it.
 * The new data is a transformed copy of the original form
 */

public class SequentialStreamDemo {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hell", "Gl", "E", "E", "K", "S!");
		
		// using parallelStream()
		// method for parallel stream
		list.parallelStream().filter(e -> e.contains("l"));
	}
}
