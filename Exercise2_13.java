import java.util.*;
public class Exercise2_13 
{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the monthly saving amount: ");
		double savings = input.nextDouble();
		
		double m1 = savings * (1. + 0.00417);
		double m2 = (savings + m1) * (1 + 0.00417);
		double m3 = (savings + m2) * (1 + 0.00417);
		double m4 = (savings + m3) * (1 + 0.00417);
		double m5 = (savings + m4) * (1 + 0.00417);
		double m6 = (savings + m5) * (1 + 0.00417);
		double totalSavings = m6;
					
		System.out.printf("After the sixth month, the account value is $%.2f" , totalSavings);
	}	
// saving: 100 output problem two decimal point
}
