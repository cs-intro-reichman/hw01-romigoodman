/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		// defining integers that will get args from terminal
		
		int num2 = Integer.parseInt(args[0]);

		int numOfQuaters = (num2 / 25) ;
		int numOfCoins = (num2 % 25) ;

		System.out.println("use " + numOfQuaters + " quarters and " + numOfCoins + " cents ");
	}
}