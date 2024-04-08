//Given the number of rows n. Print the first n rows of Pascal’s triangle.


import java.util.*;
public class s2_2_pascal_triangle_variant3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row  = sc.nextInt();
		List<List<Integer>> ans = new ArrayList<>();
		for(int i = 1;i<=5;i++) {
			List<Integer> temp = new ArrayList<>();
			for(int j = 1;j<=i;j++) {
				temp.add(nCr(i-1, j-1));
			}
			ans.add(temp);
		}
		
		
		
		
		  System.out.print("[");
	        for (int i = 0; i < ans.size(); i++) {
	            System.out.print(ans.get(i));
	            if (i != ans.size() - 1) {
	                System.out.print(",");
	            }
	        }
	        System.out.println("]");
		

	}
	
	
	private static int nCr(int n,int r) {
		int ans = 1;
		for(int i = 0;i<r;i++) {
			ans= ans*(n-i);
			ans = ans/(i+1);
		}
		return ans;
	}
	

}
