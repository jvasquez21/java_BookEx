
public class Exercise06_25 
{

	public static void main(String[] args) 
	{
		
		
		System.out.println(convertMillis(5500));
		System.out.println(convertMillis(100000));
		System.out.println(convertMillis(555550000));
		
	}
	public static String convertMillis(long millis)
	{
		long sec = (long) (millis/1000) % 60 ;
		long min = (long) ((millis/(1000*60)) % 60);
		long hours   = (long) ((millis/(1000*60*60)));
		/*long sec = (long) (millis * 0.001);
		long min = (long)(millis * 0.000016667) ;
		long hours = (long)(millis * 0.000000278);*/
		
		return hours +":"+ min + ":" + sec;
		
		
				
	}
	
	
	
}
