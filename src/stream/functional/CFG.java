package stream.functional;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CFG {
	public static void main(String[] args) {
		// Creating a predefined stream using range method
		// custom inputs for range as paramters
		var stream = IntStream.range(1, 100);

		// Stream is created
		var max = stream.filter(number -> number % 4 == 0).count();

		// Print and display the maximum number
		// from the stream
		System.out.println(max);

		/**
		 * 
		 */

		System.out.println("______________________________________________");

		Integer[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		// Stream
		var streamOfNumbers = Arrays.stream(numbers);

		// Using filter method
		var evenNumbersStream = streamOfNumbers.filter(number -> number % 3 == 0).count();

		System.out.println(evenNumbersStream);
	}
}
