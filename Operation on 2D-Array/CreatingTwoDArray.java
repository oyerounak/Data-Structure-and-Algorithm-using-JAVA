import java.util.Scanner;

public class CreatingTwoDArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int Numbers [][] = new int [row][col];
		
		//input
		//row
		for (int i =0;i<row;i++) {
			//col
			for(int j = 0;j<col;j++) {
				Numbers[i][j]=sc.nextInt();
			}
		}
		
		//output
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(Numbers[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
