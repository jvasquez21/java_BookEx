import java.util.*;
public class Exercise2_09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter v0, v1, and t: ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		
	    double a = (v1 -v0)/t;
		
		/*a *=10;
		a = (int) a;
		a = a / 10.0;
	*/
	
		System.out.printf("The average acceleration is %6.4f", a);

	}
// Input: 5.5 50.9 4.5 Output: 10.0889 (problem four decimal point) 10.       4.8 look 
}
