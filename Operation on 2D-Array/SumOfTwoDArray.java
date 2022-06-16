
public class SumOfTwoDArray {
	public static void main(String[] args) {
		int Array1[][] = {{1,2,3},{4,5,6},{6,7,9}};
		int Array2[][] ={{1,2,3},{4,5,6},{6,7,9}};
		
		int Array3[][] =new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				Array3[i][j]=Array1[i][j]+Array2[i][j];
				System.out.print(Array3[i][j]+" ");
			}
		System.out.println();
		}
		
		
	}

}
