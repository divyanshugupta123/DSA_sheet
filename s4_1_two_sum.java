import java.util.*;
public class s4_1_two_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,7,11,15};
		int tar = 9;
		System.out.println(solution(arr, tar));
		int ans[] = solution1(arr, tar);
		System.out.println(ans[0]);
		System.out.println(ans[1]);
	}
	private static int[] solution1(int[] arr,int tar) {
		int[] ans = new int[2];
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==tar) {
					ans[0] = i;
					ans[1] = j;
				}
			}
		}
		return ans;
	}

	private static boolean solution(int[] arr,int tar) {
		Arrays.sort(arr);
		int i = 0,j = arr.length-1;
		while(i<=j) {
			if(arr[i]+arr[j]==tar) {
				return true;
			}else if(arr[i]+arr[j]>tar) {
				j--;
			}else {
				i++;
			}
		}
		return false;
	}
}
