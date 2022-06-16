import java.util.Scanner;

public class SpiralOfMatrix {
	//Time Complexity = O(n*m)
	//Space Complexity = O(1)
	
	public static void SpiralPrint(int row, int col, int matrix[][]) {
		
		int rowStart = 0;
		int rowEnd = row-1;
		int colStart = 0;
		int colEnd = col-1;

		while(rowStart <= rowEnd && colStart <= colEnd) {
			//1
			for(col=colStart; col<=colEnd; col++) {
			System.out.print(matrix[rowStart][col] + " ");
			}
			rowStart++;
			//2
			for(row=rowStart; row<=rowEnd; row++) {
			System.out.print(matrix[row][colEnd] +" ");
			}
			colEnd--;
			//3
			for(col=colEnd; col>=colStart; col--) {
			System.out.print(matrix[rowEnd][col] + " ");
			}
			rowEnd--;
			//4
			for(row=rowEnd; row>=rowStart; row--) {
			System.out.print(matrix[row][colStart] + " ");
			}
			colStart++;
		}
		
	}
	
	
public static void main(String[] args) {  
	
	//Spiral Matrix
	Scanner sc = new Scanner(System.in);
	int row = sc.nextInt();
	int col = sc.nextInt();
	int matrix[][] = new int[row][col];
	
	for(int i=0; i<row; i++) {
		for(int j=0; j<col; j++) {
		matrix[i][j] = sc.nextInt();
		}
	}
	System.out.println("The Spiral Order Matrix is : ");

	SpiralPrint(row,col,matrix);
	
	}
}


