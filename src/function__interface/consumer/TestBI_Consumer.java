package function__interface.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class TestBI_Consumer {
	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>() {
			{
				add(2);
				add(1);
				add(3);
			}
		};

		List<Integer> list2 = new ArrayList<>() {
			{
				add(2);
				add(1);
				add(2);
			}
		};

		// BI consumer to compare both lists
		BiConsumer<List<Integer>, List<Integer>> equals = (listA, listB) -> {
			if (listA.size() != listB.size()) {
				System.out.println("False");
			} else {
				for (int i = 0; i < list1.size(); i++) {
					if (listA.get(i) != listB.get(i)) {
						System.out.println("false");
						return;
					}
				}
				
				System.out.println("true");
			}
		};
		
		
		
		equals.accept(list1, list2);
		

	}
}
