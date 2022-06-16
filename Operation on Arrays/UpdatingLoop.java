import java.util.Arrays;
import java.util.Scanner;

public class UpdatingLoop {
	public static void main(String[] args) {
		
		int[] arr = new int []{1,2,3,4,5,6,7};
		System.out.println("Press 1 to continue & 0 to stop");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		sc.close();
		
		while (input==1) {
		System.out.println("Enter the index value:");
		int index = sc.nextInt();
		System.out.println("Enter the element:");
		int ele = sc.nextInt();
		
		if(index <arr.length) {
			arr[index]=ele;
			
		}
		else {
			System.out.println("Array index out");
		}
		System.out.println("Press 1 to continue & 0 to stop");
		input =sc.nextInt();
		
		}
		System.out.println(Arrays.toString(arr));
	}

}
