

public class LinearEq {
	public static void main(String[] args) {

	
	double numberA;
	double numberB;
	double numberC;

	numberA = Double.parseDouble(args[0]);
	numberB = Double.parseDouble(args[1]);
	numberC = Double.parseDouble(args[2]);


	double x = (numberC - numberB) / numberA;

	System.out.println(numberA + " * x + " + numberB + " = " + numberC);
	System.out.println("x = " + x);

}
	}
