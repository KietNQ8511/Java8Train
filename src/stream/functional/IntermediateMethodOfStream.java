package stream.functional;

import java.util.List;

public class IntermediateMethodOfStream {
	public static void main(String[] args) {
		// Custom entries in the list elements
		List<Integer> intList = List.of(15,20,48,63,49,27,56,32,9);
		
		// Calling the function to print the list of even numbers
		printEvenNumer(intList);
	}
	
	static void printEvenNumer(List<Integer> intList) {
		System.out.println("\nEven numbers are : ");
		
		// Illustrating filter method usage
		intList.stream().filter(elm -> elm  % 2 == 0)
			.forEach(e -> System.out.print(e + " "));
	}
}
