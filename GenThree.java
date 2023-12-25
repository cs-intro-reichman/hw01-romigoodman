import java.util.Random;

public class GenThree {
	public static void main(String[] args) {

	int min = Integer.parseInt(args[0]);
	int max = Integer.parseInt(args[1]);
	
	int randomNumber1 =(int)(Math.random() * (max-min+1) +min);
	int randomNumber2 =(int)(Math.random() * (max-min+1) +min);
	int randomNumber3 =(int)(Math.random() * (max-min+1) +min);

	System.out.println (randomNumber1);
	System.out.println (randomNumber2);
	System.out.println (randomNumber3);

	int minimumNumber1 = Math.min((Math.min(randomNumber1, randomNumber2)),randomNumber3);

	System.out.println ("The minimal generated number was " + minimumNumber1);

	}
}
