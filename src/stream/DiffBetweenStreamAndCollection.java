package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DiffBetweenStreamAndCollection {
	public static void main(String[] args) {
		/**
		 * Using Collection with comparator to sort
		 */
		List<String> CompanyList = new ArrayList<>();

		// Adding elements using add() method
		CompanyList.add("Google");
		CompanyList.add("Apple");
		CompanyList.add("Microsoft");

		// Now creating a comparator
		Comparator<String> com = (String o1, String o2) -> o1.compareTo(o2);

		// Sorting the list
		Collections.sort(CompanyList, com);

//		System.out.println(CompanyList);

		/**
		 * Using stream API to sort
		 */
		// Creating an empty Arraylist
        List<String> CompanyList2 = new ArrayList<>();
 
        // Adding elements to above ArrayList
        CompanyList2.add("Google");
        CompanyList2.add("Apple");
        CompanyList2.add("Microsoft");
        
        List<String> list2 = CompanyList2.stream().sorted().toList();
        System.out.println(list2);
	}
}
