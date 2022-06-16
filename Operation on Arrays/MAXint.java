	import java.util.Arrays;
import java.util.Scanner;

public class MAXint {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer numbers separated by space: ");
		String numbers = sc.nextLine();
		
		//Converting String Array To Int Array Seprated by Spaces
		int[] intArray = convertStringArrayToIntArray(numbers.split("\\s+"));
		int maxInt = findMaxIntInArray(intArray);
		
		//Printing the elements of the Array
		System.out.println("*** Initial Array ***");
		System.out.println(Arrays.toString(intArray));
		
		//Printing Max Int Element value of the array
		System.out.println("*** Max number in array ***");
		System.out.println(maxInt);
	}
	
	public static int findMaxIntInArray(int[] Array) {
		int max = Array[0];
		for (int i : Array) {
			if (i > max) {
				max = i;
			}
		}
		return max;

	}
	static int[] convertStringArrayToIntArray(String[] stringArray) {
		//Creating an Array of Length equals to String Array.
		int[] intArray = new int[stringArray.length];
		for (int i = 0; i < stringArray.length; i++) {
			intArray[i] = Integer.valueOf(stringArray[i]);
		}
		return intArray;
	}

}