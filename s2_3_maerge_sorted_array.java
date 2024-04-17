import java.util.*;
public class s2_3_maerge_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a1 = {1,2,3,0,0,0};
		int[] a2 = {2,5,6};
		int m = 3;
		int n = 3;
		
		int[] ans = solution(a1, a2, m, n);
		for(int i = 0 ; i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
		
		
		
	}
	private static int[] solution(int[] a1,int[] a2,int m,int n) {
//		Arrays.sort(a1);
//		Arrays.sort(a2);
		for (int j = 0, i = m; j < n; j++) {
            a1[i] = a2[j];
            i++;
        }
        Arrays.sort(a1);
		return a1;
		
	}
}
