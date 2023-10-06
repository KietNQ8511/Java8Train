package stream.functional;

import java.util.List;

public class SortStream {
	public static void main(String[] args) {
		List<Integer> intList = List.of(68, 45, 99, 99, 21, 21, 8, 76, 34, 19);

		intList.stream().sorted().forEach(element -> System.out.println(element));

		intList.stream().distinct().forEach(e -> System.out.print(e + " "));
		
		System.out.println();
		System.out.println(0x57);
	}
}
