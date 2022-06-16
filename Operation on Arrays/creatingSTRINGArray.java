import java.util.Scanner;

public class creatingSTRINGArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Length:");
		int size = sc.nextInt();
		String names[] = new String[size];
		for (int i = 0; i < size; i++) {
			names[i]= sc.next();		
		}
		
		for ( int i = 0; i < names.length; i++) {
			System.out.println(("name at " + (i) +" index is : " + names[i]));

		}
	sc.close();
	}

}
