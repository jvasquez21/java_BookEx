
import java.util.*;
public class Exercise03_29 
{

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double r1 = sc.nextDouble();
		
		System.out.print("Enter circle2's center x-, y-coordinates, and radius:");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double r2 = sc.nextDouble();
		
		double form = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)); 
				if (form <= Math.abs(r1 - r2))
		System.out.print("circle2 is inside circle1 ");
		else if (form <= r1 + r2)
		System.out.print("circle2 overlaps circle1");
		else
		System.out.print("circle2 does not overlap circle1");
		

	}

}
