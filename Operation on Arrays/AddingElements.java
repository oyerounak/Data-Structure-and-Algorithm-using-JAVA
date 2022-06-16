import java.util.Arrays;

public class AddingElements {
	public static void main(String[] args) {
	
			int arr[]= {1,2,3,4,5,6,7};
			int arr1[]=new int[arr.length+1];
			int value = 8;
			for(int i =0;i<arr.length;i++) {
				
				arr1[i]=arr[i];
			}
			arr1[arr.length] = value;
			
			System.out.println(Arrays.toString(arr1));
		
	}

}
