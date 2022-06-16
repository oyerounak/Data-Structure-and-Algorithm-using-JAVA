import java.util.Arrays;
import java.util.Scanner;

public class StringArrayToIntArray {
	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter numbers seprated by spaces : ");
		String numbers = sc.nextLine();
		int[] array = ConvertingStringToIntArray(numbers.split("\\s+"));
		System.out.println("**Initial Array**");
		System.out.println(Arrays.toString(array));
		
		}
		
	public static int[] ConvertingStringToIntArray(String[] StringArray) {
		int IntArray[] = new int[StringArray.length];
		for(int i=0;i<StringArray.length;i++) {
			IntArray[i]=Integer.valueOf(StringArray[i]);
		}
		return IntArray;
	}

}
