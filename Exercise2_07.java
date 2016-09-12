import java.util.*;
public class Exercise2_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of minutes: ");
		int min = input.nextInt();
		
		int year = min / 525600;
		double coDay  = (min/525600. - year) * 365;
		int days = (int)coDay;
	
		System.out.print(min + " minutes is approximately " + year + " years and " + days + " days");
	}

}
