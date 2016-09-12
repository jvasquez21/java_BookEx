/* (Find the largest n such that n^3 < 12,000) Use a while loop to the find 
 * the largest integer n such that n^3 less than 12,000 */
public class Exercise5_13 
{

	public static void main(String[] args) 
	{
		int n =  0;
		int n3 = (int)(Math.pow(n, 3));
		while(n3 < 12000)
		{
			
			n+=1;
			n3 = (int)(Math.pow(n,3));
			
		}
		System.out.println(n-1);
		

	}

}


