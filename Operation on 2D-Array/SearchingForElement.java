import java.util.Scanner;

public class SearchingForElement {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int Array[][] = new int [row][col] ;
		
		//input
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				Array[i][j]=sc.nextInt();
			}
		}
		
		//output
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(Array[i][j]+" ");
			}
			System.out.println();
		}
		
		
		//finding x
		int x = sc.nextInt();

		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				//compare with x
				if (Array[i][j]==x) {
					System.out.println("x found at "+i+","+j);
				}
			}
		}
		
	}

}
