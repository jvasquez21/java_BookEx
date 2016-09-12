import java.util.*;
public class Exercise3_05 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print ("Enter today's day: ");
		int day = input.nextInt();
		String day1 = "";
		switch (day)
		{
		case 0: day1 = "Sunday";break;
		case 1: day1 = "Monday";break;
		case 2: day1 = "Tuesday";break;
		case 3: day1 = "Wednesday";break;
		case 4: day1 = "Thursday";break;
		case 5: day1 = "Friday"; break;
		case 6: day1 = "Saturday";break;
	
		}
		System.out.print ("Enter the number of days elapsed since today: ");
		int future = input.nextInt();
		
		int elapsed = day + (future % 7);
		if (elapsed > 6)
			elapsed -= 7;
		
		String dayW = "";
		switch (elapsed)
		{
		case 0: dayW = "Sunday";break;
		case 1: dayW = "Monday";break;
		case 2: dayW = "Tuesday";break;
		case 3: dayW = "Wednesday";break;
		case 4: dayW = "Thursday";break;
		case 5: dayW = "Friday"; break;
		case 6: dayW = "Saturday";break;
	
		}
		/* if(elapsed == 0)
		{
			
		}
		 * */
		
		System.out.print ("Today is " + day1 + " and the future is " + dayW);
	}
}
