/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		// defining integers that will get args from terminal
		
		String name = args[0];
		int num2 = Integer.parsInt(name);

		int numOfQuaters = (num2 / 25) ;
		int numOfCoins = (num2 % 25) ;

		System.out.println("% java coins" + num2);
		System.out.println("use " + numOfQuaters + " and " + numOfCoins + " cents ");
	}
}