package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	/**
	 * [stream API] filter and collect operations
	 */
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();

		al.add(2);
		al.add(6);
		al.add(9);
		al.add(4);
		al.add(20);

		System.out.println("Print the collection : " + al);

		// filter even element
		List<Integer> ls = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("Printing the List after stream operation : " + ls);
		
	}

}
