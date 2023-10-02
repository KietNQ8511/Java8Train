package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
	public static void main(String[] args) {
		 // Creating an integer Arraylist to store marks
		List<Integer> marks = new ArrayList<Integer>();
  
        // These are marks of the students
        // Considering 5 students so input entries
        marks.add(30);
        marks.add(78);
        marks.add(26);
        marks.add(96);
        marks.add(79);
  
        System.out.println("Marks of student before grace : " + marks);
        
        List<Integer> updatedMarks = marks.stream().map(i -> i + 6).collect(Collectors.toList());
        
        System.out.println("Marks of students after grace : " + updatedMarks);
        
        
        System.out.println("=======================================================");
        
        
        // example 3 
        List<Integer> transactionsIds;
	}
}
