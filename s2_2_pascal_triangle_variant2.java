
//Given the row number n. Print the n-th row of Pascal’s triangle.



import java.util.*;
public class s2_2_pascal_triangle_variant2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		List<Integer> l = new ArrayList<>();
		int ans = 1;
		l.add(ans);
		for(int i = 1;i<row;i++) {
			ans = ans*(row-i);
			ans = ans/(i);
			l.add(ans);
		}
		for(int i = 0 ; i<l.size();i++) {
			System.out.println(l.get(i)+" ");
		}
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
