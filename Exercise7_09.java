
import java.util.*;
public class Exercise7_09 
{

	public static void main(String[] args) 
	{
		double[] a = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        for (int c = 0; c < a.length; c++) {
            a[c] = input.nextDouble();
        }
        System.out.print("The minimum number is: " + min(a));
    }

    private static double min(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}
