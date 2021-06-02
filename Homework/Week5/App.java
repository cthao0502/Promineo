package Week5;

public class App {
	//Q9: Main method named App.
	
	public static void main(String[] args) {
		
	//Q10: Instantiate an instance of each logger classes implemented in the Logger interface.
		
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
	//Q11: Test both methods on both instances, passing in Strings of your choice.
		
		asteriskLogger.Log("Hey yo!");
        asteriskLogger.Error("Goodbye!");

        System.out.println();

        spacedLogger.Log("Hello");
        spacedLogger.Error("SUPER ERROR");

	}

}
