package stream.program;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MapStream {
	
	// Generic function to convert list of
	// String to List of Integer
	public static <K, V> Stream<Map.Entry<K, V>> convertMapToStream(Map<K, V> map) {
		// Convert the map to set
		// convert the Set to stream
		return map.entrySet().stream();
	}
	
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		// Add entry to the map
		map.put(1, "Dog");
		map.put(2, "Cat");
		map.put(3, "chicky");
		
		System.out.println("Map : " + map);
		 
		Stream<Map.Entry<Integer, String>> stream = convertMapToStream(map);
		
		System.out.println("Stream : " + Arrays.toString(stream.toArray()));
		
	}
	
}
