
import java.util.*;
public class Exercise06_03
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num = sc.nextInt();
		
		if (isPalindrome(num))
			System.out.print(" is palindrome");
			else
			System.out.print(" is not palindrome");

	}
	
	public static int reverse(int number)
	{
		int r = 0;
		int di;
		while(number > 0)
		{
			di = number % 10;
			number = number / 10;
			r = r * 10 + di;
			
		}
		return r;
		
	}
	
	public static boolean isPalindrome(int number)
	{
		if (number < 0)
			return false;
 
		
		int div = 1;
		while (number / div >= 10) {
			div *= 10;
		}
 
		while (number != 0) {
			int left = number / div;
			int right = number % 10;
 
			if (left != right)
				return false;
 
			number = (number % div) / 10;
			div /= 100;
		}
 
		return true;
    }
	}


