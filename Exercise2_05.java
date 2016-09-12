import java.util.*;
public class Exercise2_05 {

	public static void main(String[] args) 
	{
	Scanner input = new Scanner(System.in);	
	
	System.out.print("Enter the subtotal and a gratuity rate:");
	double subTotal = input.nextDouble();
	double graRate = input.nextDouble();
	
	double rate = (graRate/100.0)*subTotal;
	double graTotal = rate + subTotal;
	
	System.out.print("The grauity is $" + rate + " and total is $" + graTotal);

	}

}
