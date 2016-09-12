
public class Exercise5_11 
{

	public static void main(String[] args) 
	{
		int lineCnt = 0;
		
		for(int numA = 100; numA <=200; numA++)
		{
			if(numA % 5 == 0 ^ numA % 6 == 0)
			{
				
					System.out.print(numA +" ");
					lineCnt++;
					if (lineCnt == 10)
					{
						lineCnt = 0;
					    System.out.print("\n");
					}
				
				
			}
		
		}
	}
}


