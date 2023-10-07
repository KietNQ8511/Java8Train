package generic.method;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GenericMethod1 {

	/**
	 * We write generic methods with a single method declaration, and we can call them with arguments of different types.
	 * The compiler will ensure the correctness of whichever type we use
	 */
	
	<T> List<T> fromArrayToList(T[] a) {
		return Arrays.stream(a).collect(Collectors.toList());
	}
	
	static <T, G> List<G> fromArrayToList(T[] a, Function<T, G> mapperFunction) {
		return Arrays.stream(a).map(mapperFunction).collect(Collectors.toList());
	}
	
	
}
