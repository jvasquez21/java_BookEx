/* (Find the number of days in a month) Write a program that prompts the user to enter the month and year
 *   and displays the number of days in the month.  For ex, if the user entered month 2 and year 2012, the 
 *   program should display that February 2012 had 29 days.  If the user entered month 3 and year 2015, the 
 *   program should display that March 2015 had 31 days.
 *   */
import java.util.*;
public class Exercise3_11 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the month #: ");
		int month = input.nextInt();
		
		System.out.print("Enter the year: ");
		int year = input.nextInt();
		
		
		String mons = "";
		
		switch(month)
		{
		case 0: mons = "N/A";break;
		case 1: mons = "January";break;
		case 2: mons = "February";break;
		case 3: mons = "March";break;
		case 4: mons = "April";break;
		case 5: mons = "May"; break;
		case 6: mons = "June";break;
		case 7: mons = "July";break;
		case 8: mons = "August";break;
		case 9: mons = "September";break;
		case 10: mons = "October";break;
		case 11: mons = "November";break;
		case 12: mons = "December"; break;
		
		
		}
		int day = 0;
		
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
						day = 31;
		else if(month == 2)
			{
				if((year % 4 == 0 && year % 100 != 0 )||(year % 400 == 0))
					 day = 29;
				else 
					 day = 28;
			}
		else
			day = 30;
		System.out.print (mons + " "  +  year + " had days " + day);

	}

}
