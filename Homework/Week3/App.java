package test;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
		//Intro to Java Week 3 Coding Assignment
		
		// Q1: Array of ages containing values: 3, 9, 23, 64, 2, 8, 28, and 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		// Q1a: subtract value of first element in array from last element of array.
		int lengthOfArray = ages.length;
		int difference = Math.abs(ages[lengthOfArray - lengthOfArray] - ages[lengthOfArray - 1]);
			System.out.println("The difference between the first and last element in ages is: " + difference);
		
		// Q1b: Add a new age to array and repeat steps above.
		int[] newAges = new int[ages.length];
		System.arraycopy(ages,  0, newAges, 0, ages.length);
		lengthOfArray = newAges.length;
		newAges[lengthOfArray - 1] = 99;
		difference = Math.abs(newAges[lengthOfArray - lengthOfArray] - newAges[lengthOfArray - 1]);
			System.out.println("The difference bewteen the first and last element of newAges is: " + difference);
		
		// Q1c: Use a loop to calculate the average age of the array above.
		int sum = 0;
		for (int i = 0; i < newAges.length; i++) {
			sum += newAges[i];
		}
		double average = sum / lengthOfArray;
			System.out.println("The average of newAges is: " + average );
		
		// Q2: Array of String with values: Sam, Tommy, Tim, Sally, Buck, and Bob.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		// Q2a: Loop iterating through array to calculate the average number of letters per name.
		sum = 0;
		for (int i = 0; i < names.length; i++) {
			sum += names[i].length();
		}
		average = sum / names.length;
			System.out.println("The average number of letters per name is: " + average );
		
		// Q2b: Loop to concatenate all names together, separated by spaces.
		String allNames = "";
		for (int i = 0; i < names.length; i++) {
			allNames += names[i] + " ";
		}
			System.out.println(allNames);
		
		// Q3: Access the last element of any array.
			System.out.println("Use array[arr.length - 1] to access the last element on any array.");
		
		// Q4: Access the first element of any array.
			System.out.println("Use array[0] to access the first element on any array");
		
		// Q5: New array called nameLength and loop to add the length of each name to nameLengths array.
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length(); 
		}
		
		// Q6: Loop to calculate the sum of all elements in the array.
		sum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sum += nameLengths[i];
		}
			System.out.println("The sum of all lengths in nameLengths[] = " + sum);
		
		// Q7: Method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times.
			System.out.println(repeatedWord("Hello", 3));
		
		// Q8: Method takes two Strings, firstName and LastName and returns full name.
			System.out.println(fullName("Tom", "Smith"));
		
		// Q9: Method array of int and returns true if the sum of all ints in array is > 100.
			System.out.println("This is to check if the sum of an array is greater than 100: " + checkSumAges(ages));
		
		// Q10: Method that takes an array of double and returns the average of all elements in array.
		double[] gradePoints = {2.5, 1.5, 3.0};

			System.out.println("Grade Point Average: " + gradePointAverage(gradePoints));
		
		// Q11: Method that takes two arrays of double and returns true if the average of the first array is greater than second array.
		double[] gradePoints2 = {3.4, 4.0, 2.8};
			System.out.println("Returns true if first array is greater than second array: " + isFirstGradePointGreater(gradePoints, gradePoints2));
		
		// Q12: Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
		//      and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		boolean isHotOutside = true;
		double moneyInPocket = 11.50;
			System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
			
		// Q13: 13.	Create a method of your own that solves a problem.  This problem is to find the average amount of studying my son does in a day.
		// If he studies for more than an average of 3 hours, I will buy him ice cream. I created this because I want more practice with boolean methods.
		boolean buyIceCream = true;
		int[] studyingHours = {1, 2, 3};
		double total = 0;
		for(int i = 0; i < studyingHours.length; i++) {
			total = total + studyingHours[2];
		}
		
		double averageStudyHours = total / studyingHours.length;
			System.out.println(willBuyIceCream(buyIceCream, averageStudyHours));
		
		
	}
	
	private static String repeatedWord(String word, int n) {
		String repeatedWord = "";
		for (int i = 0; i < n; i++) {
			repeatedWord += word;
		}
		return "returns: "+ repeatedWord;
	}
	
	private static String fullName(String firstName, String lastName) {
		return "returns: "+ firstName + " " + lastName;
	}
	
	private static Boolean checkSumAges(int[] arr) {
		return Arrays.stream(arr).sum() > 100;
	}

	private static double gradePointAverage(double[] arr) {
		return Arrays.stream(arr).average().orElse(Double.NaN);
	}
	
	private static boolean isFirstGradePointGreater(double[] firstArr, double[] secondArr) {
		return gradePointAverage(firstArr) > gradePointAverage(secondArr); 
	}
	
	private static boolean willBuyDrink(Boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.50);
		return true;
	}
	private static boolean willBuyIceCream(Boolean buyIceCream, double averageStudyHours) {
		if (buyIceCream && averageStudyHours > 3);
		return true;
	}
}



