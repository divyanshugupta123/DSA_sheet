import java.util.*;

public class s1_4_maximum_sum_subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(maximumSumSubarray(arr));
		
	}
	private static int maximumSumSubarray(int [] arr) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			
			sum += arr[i];
			if(sum>max) {
				max = sum;
			}
			if(sum<0) {
				sum=0;
			}
			
			
			
			
		}
		return max;
	}

}
