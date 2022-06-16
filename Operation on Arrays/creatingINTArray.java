import java.util.Scanner;

public class creatingINTArray {
	public static void main(String[] args) {
		//Time Complexity = O(n)
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size: ");
		int size = sc.nextInt(); //Size of the array.
		
		sc.close();
		
		System.out.println("Enter the array Element: ");
		int arrelement[] = new int[size];  //Initializing array Size.
		
		int i;
		for(i = 0;i<size;i++) {
			arrelement[i]=sc.nextInt();  //Taking Array Elements Input.
		}
		
		for(i=0;i<arrelement.length;i++) {
			System.out.print(arrelement[i]+" "); //printing array elements.
		}
		
	}

}
