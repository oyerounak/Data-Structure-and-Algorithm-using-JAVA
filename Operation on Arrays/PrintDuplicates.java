
public class PrintDuplicates {
	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,5,6,4,2,1,2};
		
		//Searches for Duplicates.
		for (int i =0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]==arr1[j]) {
					System.out.println(arr1[j]);
				}
			}
		}
		
	}

}
