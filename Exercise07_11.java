import java.util.*;
public class Exercise07_11 
{

	public static void main(String[] args) 
	{
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("Enter ten numbers: ");
		 double [] x = new double[10];
		 for (int i = 0; i < x.length; i++)
	         {
	          x[i] = sc.nextDouble();
	         }
			
		System.out.printf("The mean is %.2f " , mean(x));
		
		System.out.printf("\nThe standard deviation is %.5f" , deviation(x));	
	}
	public static double deviation(double[] x)
	{
		double sta = 0;
		for(int i = 0; i < x.length; i++)
		sta += ((x[i] - mean(x)) * (x[i] - mean(x))); 
				
				
		return Math.sqrt(sta/(10 - 1));
		
	}
	
	public static double mean(double[] x)
	{
		double sum = 0;
	       for(int i = 0; i < x.length; i++)
	              sum += x[i];
	     
	 
	        return sum/x.length;
				
	
	}


}
