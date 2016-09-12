
public class Exercise5_25 
{

	public static void main(String[] args) 
	{
		for (int n = 1; n <= 10; n++) 
		{
		    double x = 0.;
		    for (int i = 1; i <= n * 10000; i++)
		    {
		       x = (x + Math.pow(-1, i + 1) / (2 * i - 1)); 
		   
		    }
		    System.out.println(x * 4);
		    
		}
		

		

	}

}
