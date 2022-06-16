
public class RotatingArray {
	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,5};
		
		int n =3;
		for(int i = 0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		for(int i = 0; i < n; i++){  
            int j, first;  
            //Stores the first element of the array  
            first = arr1[0];  
            for(j = 0; j < arr1.length-1; j++){  
                //Shift element of array by one  
                arr1[j] = arr1[j+1];  
            }  
            //First element of array will be added to the end  
            arr1[j] = first;  
        }  
		System.out.println();
		for(int i = 0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
	}

}
