import java.util.Arrays;

public class ThirdLargest {
	public static void main(String[] args) {
		
		int [] arr= {1,2,3,4,5,6,7,8};
		int length=arr.length;
		
		ThirdLargestElement(arr,length);
		System.out.println(SecondSmallest(arr,length));
	
			
	}
	//Function for second Smallest Element in Array
	public static int SecondSmallest(int arr[], int n) {
		
		Arrays.sort(arr);
		return arr[1];
		
		
	}
	
	//function for Third Largest Element in Array.
	public static void ThirdLargestElement(int arr[], int n) {
		
		Arrays.sort(arr);
		
		System.out.println(arr[n-2]);
		return;
	}
	

}
