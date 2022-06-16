
public class CopyElementsOfArray {
	public static void main(String[] args) {
		
		//creating one array
		int [] arr1 = {1,2,3,4,5,6,6};
		
		//creating second array of same length of arr1
		int arr2[] = new int[arr1.length];
		
		//Copying elements of one arr1 to arr2
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
			
		}
		//Displaying elements of arr1
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println();
		//Displaying elements of Arr2
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		
		//Another way to copy elements to another array.
		int cloneArray[] = arr1.clone();
		for(int i=0;i<cloneArray.length;i++) {
		System.out.print(cloneArray[i]+" ");
				
			}
		
			
		
	}

}
