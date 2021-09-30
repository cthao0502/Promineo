
public class App {

	public static void main(String[] args) {
		// Introduction to Java Week 1 Coding Assignment
	   
		//Question 3a - primitive data types
		double football = 9.99;
		double basketball = 14.99;
		
		//Question 3b - primitive data types
		double moneyInMyWallet1 = 31.56;
		double moneyInMyWallet2 = 26.00;
		
		//Question 3c - primitive data types
		int numberOfFriends1 = 234;
		int numberOfFriends2 = 345;
		
		//Question 3d - primitive data types
		int age1 = 33;
		int age2 = 27;
		
		//Question 3e and 3f - objects
		String firstName1 = "Charlee";
		String firstName2 = "Vue";
		String lastName1 = "Thao";
		String lastName2 = "Yang";
		
		//Question 4a - Use operations to set new variables. The amount of money items cost will be subtracted from the amount
		//currently stored in moneyInMyWallet1 and moneyInMyWallet2.  Example: moneyInMyWallet1 minus football.
		double newAmountMoney1 = moneyInMyWallet1 - football;
		double newAmountMoney2 = moneyInMyWallet2 - basketball;
		
		//Question 4b - Use operations to set new variables.  The amount of friends per year based on age.  numberOfFriends1 divided by age1
		//numberOfFriends1 and numberOfFriends2 divided by age2.
		double friendsPerYear1 = numberOfFriends1 / age1;
		double friendsPerYear2 = numberOfFriends2 / age2;
		
		//Question 4c - Use operations to set new variables. This is to perform a concatenation of the first and 
		//last names of firstName1 and lastName1 for example.
		String fullName1 = firstName1 + " " + lastName1;
		String fullName2 = firstName2 + " " + lastName2;
		
		System.out.println("I bought a football that cost $"+ football + ".  At the time, I had $"+ moneyInMyWallet1 + ".  I now have exactly $" +
		newAmountMoney1 + ".  My friend bought a basketball that cost $"+ basketball + " and now he has $"+ newAmountMoney2 + ".");
		
		System.out.println("\nDuring my lifetime I have made "+ friendsPerYear1 +" friends per year. My wife has made about "+ 
		friendsPerYear2 +" friends per year in her lifetime.");
		
		System.out.println("\nMy name is " + fullName1 + ".  It means skillful in Hmong. My wife's name is "+ fullName2 + ".  "
				+ "I don't know what her name means.");
		
		
	}

}
