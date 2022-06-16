
public class CountDuplicatesInArray {
	public static void main(String[] args) {
		
		//Initializing an array
		int arr[]= {1,2,3,4,5,5,5,5,4,3,3,4,2,2,1,1,6,7,7,7,0};
		
		//array fr will store frequency of arr1
		int fr[] = new int[arr.length];
		int visited = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					//to avoid counting same element again
					fr[j]= visited;
				}

			}
			if(fr[i]!=visited) {
				fr[i]=count;
			}
		}
			//Display the frequency
			System.out.println("------------------");
			System.out.println("Element|Frequency");
			System.out.println("------------------");
			for(int i =0;i<fr.length;i++) {
				if(fr[i]!=visited) {
					System.out.println(" "+arr[i]+" | "+fr[i]);
				}
				
			}
			System.out.println("------------------");
			System.out.println(arr.length);
		
	}

}
