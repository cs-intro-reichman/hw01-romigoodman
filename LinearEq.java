/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
	public static void main(String[] args) {

	// defining a, b, c
	int numberA;
	int numberB;
	int numberC;
	numberA = Integer.parseInt(args[0]);
	numberB = Integer.parseInt(args[1]);
	numberC = Integer.parseInt(args[2]);


	int x = (numberC - numberB) / numberA;

	System.out.println(numberA + " * x + " + numberB + " = " + numberC);
	System.out.println("x = " + x);

}
	}
