
public class Exercise5_27 
{

	public static void main(String[] args)
	{
		

		int lineCnt = 0;//How many per line
		int count = 0; // How many leap years
		for(int year = 101; year <= 2100; year++)//101 to 2100 year leap year ?
		{
				if((year % 4 == 0 && year % 100 != 0 )||(year % 400 == 0)) //if leap year
				{
					System.out.print(year + " ");
					lineCnt++;
					count++;
					if(lineCnt == 10) //
					{
						lineCnt = 0;
						System.out.print("\n");
					}
					
					
				}
				
		}
			System.out.println("\n" + count);		
					
					
									 
	}

}
