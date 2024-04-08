import java.util.*;
public class s1_1_set_matrix_zero{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfRow = sc.nextInt();
		int noOfCol = sc.nextInt();
		int[][] mat = new int[noOfRow][noOfCol];
		for(int i = 0; i<mat.length;i++) {
			for(int j = 0 ; j<mat[0].length;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		int[][] sol = setMat(mat,noOfRow,noOfCol);
		display(sol);
		
	}
//	private static void setRow(int i,int[][] mat) {
//		for(int j = 0 ; j<mat[0].length;j++) {
//			if(mat[i][j] != 0) {
//				mat[i][j] = -1349374;
//			}
//		}
//	}
//	private static void setCol(int j,int[][] mat) {
//		for(int i = 0 ; i<mat.length;i++) {
//			if(mat[i][j] != 0) {
//				mat[i][j] = -1349374;
//			}
//		}
//	}
//	private static int[][] setMat(int[][] mat){
//		for(int i = 0 ; i < mat.length; i++) {
//			for(int j = 0 ; j < mat[0].length; j++) {
//				if(mat[i][j] == 0 ) {
//					setRow(i, mat);
//					setCol(j, mat);
//				}
//			}
//		}
//		
//		
//		for(int i = 0 ; i<mat.length;i++) {
//			for(int j = 0; j <mat[0].length;j++) {
//				if(mat[i][j] == -1349374) {
//					mat[i][j] = 0;
//				}
//			}
//		}
//		
//		
//		return mat;
//	}
	private static void display(int[][] arr) {
	    System.out.print("[");
	    for (int i = 0; i < arr.length; i++) {
	        System.out.print("[");
	        for (int j = 0; j < arr[0].length; j++) {
	            System.out.print(arr[i][j]);
	            if (j < arr[0].length - 1) {
	                System.out.print(",");
	            }
	        }
	        System.out.print("]");
	        if (i < arr.length - 1) {
	            System.out.print(",");
	        }
	    }
	    System.out.print("]");
	}
	
//	this is code having time complexity n*3
	private static int[][] setMat(int[][] arr,int n,int m) {
		int[] row = new int[m];
		int[] col = new int[n];
		for(int i = 0 ; i<n;i++) {
			for(int j=0; j< m ;j++) {
				if(arr[i][j]==0) {
					row[j] = 1;
					col[i] = 1;
				}
			}
		}
		for(int i = 0 ; i<n;i++) {
			for(int j = 0 ; j<m;j++) {
				if(row[j]==1||col[i]==1) {
					arr[i][j] = 0;
				}
				
			}
		}
		return arr;
	}

	
}