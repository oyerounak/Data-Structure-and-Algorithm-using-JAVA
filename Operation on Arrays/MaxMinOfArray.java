import java.util.Scanner;

public class MaxMinOfArray {

	public static void main(String[] args) {

		//taking Size of Array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int size = sc.nextInt();
		int arr[]=new int[size];
		
		//Input of Array element
		System.out.println("Enter Array Elements:");
		for (int i = 0; i < size; i++) {
			arr[i]=sc.nextInt();

		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		
		//Output of min and max value of an array
		for(int i=0;i<arr.length;i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
			else if(arr[i]<min){
				min =arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
	sc.close();
	}

}
