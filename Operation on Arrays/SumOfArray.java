import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array: ");
		int size = sc.nextInt();
		
		//Array name.
		System.out.println("Enter The array Elements: ");
		int [] array = new int[size];
		
		//Input of elements.
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		
		//Sum of Array Elements
		int sum = 0;
		for(int i = 0; i<array.length;i++) {
			sum = sum+array[i];
			
		}
		System.out.println("Sum of Array is: "+sum);
		sc.close();
		
		
		
	}
}