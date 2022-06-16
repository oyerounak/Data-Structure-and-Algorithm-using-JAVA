import java.util.Scanner;

public class AscendingCheck {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size:");
		int size = sc.nextInt();
		int Array[] = new int[size];
		
		//input of elements
		for(int i=0;i<size;i++) {
			Array[i]=sc.nextInt();
		}
		
		boolean isAscending = true;
		for(int i = 0;i<Array.length-1;i++) {
			if (Array[i]>Array[i+1]) {
				isAscending = false;
			}
		}
		if(isAscending) {
			System.out.println("Sorted");
		}
		else {
			System.out.println("not Sorted");
		}
		
		sc.close();
		
  }
}