import java.util.*;
public class s2_1_rotate_image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		for(int i = 0;i<mat.length;i++) {
			for(int j = 0 ; j<mat[0].length;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		solution(mat);
	}
	
//	private static void rotate(int[][] arr) {
//		int[][] ans = new int[arr.length][arr[0].length];
//		for(int i = 0; i<arr.length;i++) {
//			for(int j = 0 ; j<arr.length;j++) {
//				ans[j][arr.length-1-i] = arr[i][j];
//				
//			}
//			
//		}
//		display(ans);
//		
//	}
	private static void display(int[][] arr) {
		System.out.print("[");
		for(int i = 0; i<arr.length;i++) {
			System.out.print("[");
			for(int j =0 ; j<arr.length;j++) {
				if(j==arr.length-1) {
					System.out.print(arr[i][j]);
				}else {
					System.out.print(arr[i][j]+",");
				}
//				
//				
			}
			if(i==arr.length-1) {
				System.out.print("]");
			}else {
				System.out.print("]"+",");
			}
		}
		System.out.print("]");
//		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void transpose(int[][] arr) {
		for(int i = 0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
	}
	
	private static void reverseArray(int[] arr) {
		int i = 0;
		int j = arr.length-1;
		while(i<=j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;j--;
		}
	}
	
	
	
	
	private static void solution(int[][] arr) {
		transpose(arr);
		for(int i = 0 ; i<arr.length;i++) {
			reverseArray(arr[i]);
		}
		
		display(arr);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
