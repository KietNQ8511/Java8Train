package stream;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class AtomicIntegersClass {
	// create a string array
	public static void main(String[] args) {
		String[] myArr = new String[] {"stream", "is", "a", "sequence", "of", "element", "like", "list"};
		
		// create a stream on myArr
		Stream<String> myStream = Stream.of(myArr);
		
		//create an AtomicInteger
		AtomicInteger i = new AtomicInteger(0);
		
		// increment the i value by 1 everytime
		// if it is even, [rint the current element
		myStream.filter(x -> i.getAndIncrement() % 2 == 0)
						.forEach(System.out::print);
	}
	
}
