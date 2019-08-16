package sixpointthree;

import java.util.Arrays;


public class LookingForArray {
	public static void main(String args[]) { 	
		int[] holder = new int[]{244, 1, 56, 85, 34, 23, 43, 31, 12};  	
		int number = 12;    
		Arrays.sort(holder);    
		System.out.printf("Binary Search %d in "
				+ "integer array %s %n", number, Arrays.toString(holder));
		binarySearch(holder, 12);    
		}

	public static void binarySearch(int[] input, int number) {
		int first = 0;int last = input.length - 1;
		int middle = (first + last) / 2;
	while (first <= last) {  
		if (input[middle] < number) {
			first = middle + 1;
			} else if (input[middle] == number) {
				System.out.printf(number + " found at "
						+ "location %d %n", middle);
				break;
			} else {  last = middle - 1;
			}
		middle = (first + last) / 2;
	}
	if (first > last) {  System.out.println(number + " is not present in the list.\n");}
	}
}