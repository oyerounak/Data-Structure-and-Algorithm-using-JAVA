import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		
		int [] ara = new int[] {101,91,74,82,85};  //initializing an array Type 1 
		//It is used for creating array as per required.
		
		//updating the value at specific index
		//Time Complexity = O(1)
		ara[2]=37;
		
		int arr[] = {10,9,8,736,872};  //Initializing an array Type 2
				
		//This will print Garbage Value
		System.out.println(arr); 
		System.out.println(ara); 
		System.out.println();
		
		//This will print Arrays in Array Formate
		System.out.println(Arrays.toString(ara)); 
		System.out.println(Arrays.toString(arr));
		
		//code to print all the values of all the array 
		for(int i =0;i<ara.length;i++) {
			System.out.print(ara[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");

		}
		
		

	}

}
