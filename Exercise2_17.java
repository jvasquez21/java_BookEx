
import java.util.*;
public class Exercise2_17 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the temperature in Fahrenheit between -58 F and 41 F: ");
		double fa = input.nextDouble();
		
		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		double win = input.nextDouble();

		if(fa >= -58 && fa <= 41)
		 {
			if (win >= 2)
			{
			double v = Math.pow(win, 0.16);
		    double tWC = 35.74 + 0.6215 * (fa) - 35.75 * (v) + (0.4275) * (fa) * (v);  
			
		    System.out.printf("The wind chill index is %.5f"  , tWC);
			}
		 }
									
		

	}

}
