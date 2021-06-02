package Week5;

	//Q3: Create two classes that implement the Logger interface.

public class SpacedLogger implements Logger {
	
	//Q6: SpacedLogger should add spaces between each character of String.
	//Q7: If the log method received is "Hello" as an argument, it should print H e l l o
	
	@Override
	public void Log(String str) {
		StringBuilder log = new StringBuilder();
			for (int i = 0; i < str.length(); i++) {
				log.append(str.charAt(i)).append(" ");
			}
			System.out.println(log);
	}
	//Q8: The error method should do the same, but with "ERROR." preceding the spaced out input.
	
	@Override
	public void Error(String str) {
		System.out.print("Error: ");
		Log(str);
		
	}


	}


