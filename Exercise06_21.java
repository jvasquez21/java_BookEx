import java.util.*;
public class Exercise06_21 
{

	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String num = sc.nextLine();
		
		int ph = num.length();

		for (int i=0; i<ph; i++) 
		{
		   char currChar = num.charAt(i);
		
		if (Character.isLetter(currChar))
		{
		    currChar = Character.toUpperCase(currChar);
		    int number = getNumber(currChar);
		System.out.print(number);
		} 
		else
		{
		   System.out.print(currChar);
		}
				}
		System.out.println();
		}
		
		
	static int getNumber(char uppercaseLetter) 
	{
		int number = 0;
		switch (uppercaseLetter) 
		{
		case 'A':number = 2;
		case 'B':number = 2;
		case 'C':number = 2; break;
		case 'D':number = 3;
		case 'E':number = 3;
		case 'F':number = 3;break;
		case 'G':number = 4;
		case 'H':number = 4;
		case 'I':number = 4;break;
		case 'J':
		case 'K':
		case 'L':
		number = 5;
		break;
		case 'M':
		case 'N':
		case 'O':
		number = 6;
		break;
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		number = 7;
		break;
		case 'T':
		case 'U':
		case 'V':
		number = 8;
		break;
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		number = 9;
		break;
		} 
		return number;
					
		
	}		
	
}
		
		
		



	

