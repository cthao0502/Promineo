
public class Boolean1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Question 2abc - These are boolean variables and the values they hold.
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
		
		//Question 3abc - These are data types and their variables
		double costOfMilk = 2.99;
		double moneyInWallet = 15.99;
		int thirstLevel = 6;
		
		//Question 4abcd - Boolean operators and variables for scenarios
		boolean shouldByIcecream = isHotOutside && hasMoneyInPocket;
		boolean willGoSwimming = isHotOutside && !isWeekday;
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		boolean willBuyMilk = isHotOutside && (thirstLevel >=3) && (moneyInWallet >= costOfMilk * 2); 
		
		System.out.println(shouldByIcecream);
		System.out.println(willGoSwimming);
		System.out.println(isAGoodDay);
		System.out.println(willBuyMilk);
	

	}

}
