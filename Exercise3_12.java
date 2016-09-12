
import java.util.*;
public class Exercise3_12 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a three-digit integer: ");
		int num = input.nextInt();
		
		if (isPalindrome(num))
		System.out.print(num + " is a palindrome");
		else
		System.out.print(num + " is not a palindrome");
		
	
		
	}
		
		public static boolean isPalindrome(int x) {
	        
			if (x < 0)
				return false;
	 
			
			int div = 1;
			while (x / div >= 10) {
				div *= 10;
			}
	 
			while (x != 0) {
				int left = x / div;
				int right = x % 10;
	 
				if (left != right)
					return false;
	 
				x = (x % div) / 10;
				div /= 100;
			}
	 
			return true;
	    }

	

}
