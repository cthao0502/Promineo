import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App4 {

	public static void main(String[] args) {
		
		// Intro to Java Week 4 Coding Assignment
		
		//Q1: An instance of an ArrayList of String called employeeNames.
		List<String> employeeNames = new ArrayList<String>();
		
		//Q2: An instance of a HashSet of Integer called ids.
		Set<Integer> ids = new HashSet<Integer>();
		
		//Q3: An instance of a HashMap of Integer, String called employeeMap.
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		//Q4: Add at least five entries to employeeNames and ids.
		employeeNames.add("Mike");
		employeeNames.add("John");
		employeeNames.add("Andrew");
		employeeNames.add("Lee");
		employeeNames.add("Will");
		
		ids.add(10);
		ids.add(11);
		ids.add(12);
		ids.add(13);
		ids.add(14);
		
		//Q5: Iterating a variable over ids using enhanced loop.  employeeMap.put() is used inside of enhanced loop. 
		//The entry consist of a key that is the id in the enhanced loop’s current iteration, and a value that is the employeeName at position i of the employeeNames ArrayList. 
		//Increment i so that each iteration grabs the next element in the ArrayList.
		int i = 0;
		for (Integer id : ids) {
			employeeMap.put(id,  employeeNames.get(i));
			i++;
		}
		
		//Q6: Enhanced loop to iterate over employeeMap.keySet().  
		//Key is used for each iteration to print the console of current key and it's associated value on the map.
		for (Integer key : employeeMap.keySet()) {
			System.out.println(("Employee ") + key + ": " + employeeMap.get(key));
		}
		//Q7: This is a StringBuilder called idsBuilder.
		StringBuilder idsBuilder = new StringBuilder();
		
		//Q8: Iterating over the ids HashSet and append each id, followed by a dash "-" to idsBuilder.
		for (Integer id : ids) {
			idsBuilder.append(id + "-");
		}
		if (idsBuilder.charAt(idsBuilder.length() - 1) == '-') {
			idsBuilder.setLength(idsBuilder.length() - 1);			
		}
		
		//Q9: Print the result of idsBuilder.toString() to the console.
		System.out.println(idsBuilder.toString());
		
		//Q10: This is a StringBuilder called nmeasBuilder.
		StringBuilder namesBuilder = new StringBuilder();
		
		//Q11: Iterating over employeeNames ArrayList and append each name, followed by a space " " to the namesBuilder.
		for (String employeeName : employeeNames) {
			namesBuilder.append(employeeName + " ");
		}
			
		//Q12: Print the result of namesBuilder.toString() to the console.
		System.out.println(namesBuilder.toString());
	}

}
