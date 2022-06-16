
public class reversingArray {
	public static void main(String[] args) {

		int arr[] = {1,29,38,43,5,6,24,290,1986,3};
		
		
		//printing original array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");

		}
		System.out.println();
		
		//reversing an array
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+", ");
		}
		
	}

}
