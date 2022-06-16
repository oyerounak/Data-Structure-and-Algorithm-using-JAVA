import java.util.Scanner;

public class TransposeOfMatrix {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int Array[][] = new int[row][col];
		
		//input
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				Array[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		//output
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(Array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		//Printing Transpose
		//Column Major Ordering
		System.out.println("Printing Transpose of Matrix");
		for(int j=0;j<col;j++) {
			for(int i=0;i<row;i++) {
				System.out.print(Array[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
