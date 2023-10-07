package stream.program;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flatten {
	static <T> Stream<T> flatten(Collection<List<T>> collection) {
		// stream.flatMap() method convert Stream<collection> to Stream
		Stream<T> stream = collection.stream().flatMap(e -> e.stream());
		return stream;
	}
	
	
	public static void main(String[] args) {
		// Creating an object of Map class
		// Declaring object of Integer and String type
		Map<Integer, List<String>> map = new HashMap<>();
		
		map.put(1, Arrays.asList("1", "4", "7"));
		map.put(3, Arrays.asList("3", "6", "9"));
		
		System.out.println(map.values().toString());
		
		// creating a List class Object holding all elements after flattening
		List<String> s = flatten(map.values()).collect(Collectors.toList());
		System.out.println(s);
	}
}
