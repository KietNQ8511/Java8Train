package stream.array;

import java.util.Arrays;
import java.util.stream.Stream;

public class GFG {
	public static void main(String[] args) {
		String[] arr = { "Geeks", "for", "Geeks" }; 
		
		Stream<String> stm = Arrays.stream(arr);
		stm.forEach(str -> System.out.println(str + " "));
	}
}
