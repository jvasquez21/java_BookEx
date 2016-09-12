import java.util.*;
public class Exercise2_11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of years: ");
		double year =input.nextDouble(); 
	
		int currPop = 312032486;
		double birth = year * (31536000 / 7.);
		double death = year * (31536000 / 13.);
		double immig = year * (31536000 / 45.);
		double totalPop = currPop - death + birth + immig;
		
		System.out.printf("The population in 5 years is %.0f" ,totalPop);

	}
// Output --> 325932970 ask
}
