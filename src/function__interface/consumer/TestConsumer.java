package function__interface.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestConsumer {
	public static void main(String[] args) {
		
		// Consumer to multiply 2 to every Integer number in the list
		Consumer<List<Integer>> modify = list ->
		{
			for (int i = 0; i < list.size(); i++) {
				list.set(i, 2 * list.get(i));
			}
		};
		
		// Consumer to display a list number
		Consumer<List<Integer>> dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));

		// list integer
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(5);
		list.add(9);
		
		// implement dispList
		dispList.accept(list);
		
		modify.accept(list);
		
		//implement dispList
		dispList.accept(list);
		
	}
}
