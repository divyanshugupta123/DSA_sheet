import java.util.*;
public class s2_5_find_the_repeat_missing_number_using_maths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,1,2,5,3};
		int[] a = ans(arr);
		System.out.print(arr[0]+" "+arr[1]);
		
	}
	private static int[] ans(int[] arr) {
		int n = arr.length;
		int[] ans = new int[2];
		int originalSum = (n*(n+1))/2;
		int givenSum = 0;
		int square = 0;
		for(int i = 0 ; i<arr.length;i++) {
			givenSum+=arr[i];
			int squ = arr[i]*arr[i];
			square+=squ;
		}
//		thodi galti hai copy pen pr kroge to apne aap samjh aa jaegi
		int eq1 = givenSum-originalSum;
		
		
		int originalSquareSum = (n*(n+1)*(2*n+1))/6;
		
		int eq2 = square - originalSquareSum;
		
		eq2 = eq2/eq1;
		ans[0] = (eq1+eq2)/2;
		ans[1] = (ans[0]-eq1);
		return ans;
		
	}

}
