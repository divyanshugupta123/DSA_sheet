//Given row number r and column number c. Print the element at position (r, c) in Pascal’s triangle.



import java.util.*;
public class s1_2_pascals_triangle_first_variant1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		System.out.println(nCr(row-1, col-1));
		

	}
	private static int nCr(int n,int r) {
		int ans = 1;
//		kuki n-r ! uppr wale ko kaat dega
		for(int i = 0;i<r;i++) {
			ans= ans*(n-i);
			ans = ans/(i+1);
		}
		return ans;
	}

}
