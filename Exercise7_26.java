import java.util.*;
public class Exercise7_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Enter values for list1
		System.out.print("Enter list1: ");
		int size1 = input.nextInt();
		int[] list1 = new int[size1];

		for (int i = 0; i < list1.length; i++)
		  list1[i] = input.nextInt();

	
		System.out.print("Enter list2: ");
		int size2 = input.nextInt();
		int[] list2 = new int[size2];

		for (int i = 0; i < list2.length; i++)
		  list2[i] = input.nextInt();

		if (equals(list1,list2)) {
		  System.out.println("Two lists are strictly identical");
		}
		else {
		  System.out.println("Two lists are not strictly identical");
		}
	  }

		 public static boolean equals(int[] list1, int[] list2) 
		 {

			                  

             for (int i = 0; i < list1.length; i++) {
                  if (list1[i] != list2[i])
                  return false; 
                  else if(list1[i] == list2[i])
                  {
                	  return true;
                  }
          }


          return true;
		  }
	
	
	
}




