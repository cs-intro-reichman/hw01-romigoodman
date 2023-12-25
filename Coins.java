

public class Coins {
	public static void main(String[] args) {
		
		
		int num2 = Integer.parseInt(args[0]);

		int numOfQuaters = (num2 / 25) ;
		int numOfCoins = (num2 % 25) ;

		System.out.println("Use " + numOfQuaters + " quarters and " + numOfCoins + " cents ");
	}
}