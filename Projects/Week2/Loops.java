
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Question 5a - while loop that prints all even numbers from 0 to 100
		int x = 0;
			while (x <= 100) {
				System.out.println(x);
				x += 2;
		}
		//Quesion 5b - while loop that prints every 3rd number going backwards from 100 until 0
		int y = 100;
				while (y >= 0) {
					System.out.println(y);
					y -= 3;
				}
		
		//Question 5c - for loop that prints every other number from 1 to 100
		for (int i = 1; i <= 100; i += 2) {
			System.out.println(i);
		}
		
		//Question 5d - for loop that prints every number from 0 to 100, but if the number is divisible by 3, 
		//it prints "Hello" instead of the number, and if the number is divisible by 5, it prints "World" instead of the number,
		//and if it is divisible by both 3 and 5, it prints "HelloWorld" instead of the number
		
		for (int h = 0; h <= 100; h++) {
			if (h % 15 == 0) {
				System.out.println("HelloWorld");
			} else if (h % 3 == 0) {
				System.out.println("Hello");
			} else if (h % 5 == 0) {
				System.out.println("World");
			}else {
				System.out.println(h);
			}
	}
}
}
