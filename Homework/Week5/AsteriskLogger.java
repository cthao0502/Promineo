package Week5;

	// Q3: Create two classes that implement the Logger interface.

public class AsteriskLogger implements Logger {

	// Q4: Log method prints out 3 asterisks on either side of the string.
	
	@Override
	public void Log(String str) {
		System.out.println("***" + str + "***");
		
	}
	// Q5: The error method on the AsteriskLogger should print the String it receives inside a box of asterisks.
	//	****************
	//	***Error: Hello***
	//	****************

	@Override
	public void Error(String str) {
		String error = "Error: " + str;
        System.out.println("****************");
        Log(error);
        System.out.println("****************");
		
	}
	
}

