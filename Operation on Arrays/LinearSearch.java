
public class LinearSearch {
	public static void main(String[] args) {
		//Time Complexity = O(n)
		
		
		int arr[] = {10,20,30,40,50,60,70};
		int key =50;
		
		System.out.println(key+" is found at index "+Search(arr,key));
		
		
	}
	public static int Search(int arr[], int key) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}

}
