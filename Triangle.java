

public class Triangle {
	public static void main(String[] args) {

	
		int numA = Integer.parseInt (args[0]);
		int numB = Integer.parseInt (args[1]);
		int numC = Integer.parseInt (args[2]);	
		

		boolean testIfTriangle = (numA + numB) >= numC && (numA+numC) >= numB && (numB+numC) >= numA;

		System.out.println(numA + ", " + numB + ", " + numC + ": " + testIfTriangle);



	}
}
