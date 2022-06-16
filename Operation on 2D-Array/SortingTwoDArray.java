import java.util.Arrays;

public class SortingTwoDArray {
	
	public static void main(String[] args) {
	int arr[][]= {{5,4,3},
				  {3,9,7},
				  {1,0,2}};
	
	int row=3;
	int col =3;
	
	System.out.println("Before Sorting:");
	PrintArr(arr,row,col);
	Sorting(arr,row,col);
	System.out.println("After Sorting:");
	PrintArr(arr,row,col);
	}
	
	static void Sorting(int arr[][], int row,int col) {
		
		int temp[]=new int[row*col];
		int k=0;
		
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				temp[k++]=arr[i][j];
			}
		}
		Arrays.sort(temp);
		
		k=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=temp[k++];
			}
		}
		
		
	}
	
	static void PrintArr(int arr[][], int row,int col) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
