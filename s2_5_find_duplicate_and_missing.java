import java.util.*;
public class s2_5_find_duplicate_and_missing {
	public static void main(String[] args) {
		int arr[] = {3,1,2,5,3};
		int[] ans= solution(arr);
		for(int i = 0 ; i<ans.length;i++) {
			System.out.println(ans[i]);
		}
	}
	private static int[] solution(int[] A) {
	    int[] ans = new int[2];
	    int idx = -1;
	    int sum = 0;
	    int sum2 = 0;
	    Arrays.sort(A);

	    // Finding the duplicate
	    for (int i = 0; i < A.length - 1; i++) {
	        if (A[i] == A[i + 1]) {
	            idx = i;
	            ans[0] = A[i];
	            break; // No need to continue if duplicate is found
	        }
	    }

	    // Finding the missing number and sum of the array
	    for (int i = 0; i < A.length; i++) {
	        sum += A[i];
	        sum2 += (i + 1); // Sum of 1 to n
	    }
	    if(sum>sum2) {
	    	ans[1] = Math.abs(Math.abs(sum2 - sum)-ans[0]);
	    }else {
	    	ans[1] = Math.abs(sum2 - sum) + ans[0];
	    }
	     // Adjusting for the duplicate number
	    return ans;
	}

}
