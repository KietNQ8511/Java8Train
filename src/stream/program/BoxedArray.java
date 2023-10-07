package stream.program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BoxedArray {
	// A Box array is an array which is defined in the form of an object,
	// instead of the primitives.

	// generic function to convert an array to stream

	//	Using Arrays.stream(T[] array);
	static <T> Stream<T> convertArrayToStream(T array[]) {
		return Arrays.stream(array);
	}

	// Using stream of
	// Stream.of(Array[] arr)
	public static void main(String[] args) {
	}
}
