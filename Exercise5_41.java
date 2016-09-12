
import java.util.*;
public class Exercise5_41
{

	public static void main(String[] args){
		Scanner enter = new Scanner(System.in);

        int max = 0;
        int count = 1;
        int end = 1;
        System.out.print("Please enter the numbers: ");
        while (end != 0) {
            end = enter.nextInt();
            if (end > max) {
                max = end;
            } else {
                if(end == max){
                
                    count++; 
                }
            }
        }
        System.out.println("The largest number is: " + max);
        System.out.println("The occurrences count of the largest number is " + count);
    }
	}




