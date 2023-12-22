/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {

		// defining three triangle sides
		int numA = Integer.parseInt (args[0]);
		int numB = Integer.parseInt (args[1]);
		int numC = Integer.parseInt (args[2]);	
		
		//writing all the possibilities of the lengths additions in the triangle

		boolean testIfTriangle = (numA + numB) >= numC;

		System.out.println(numA + ", " + numB + ", " + numC + ": " + testIfTriangle);



	}
}
