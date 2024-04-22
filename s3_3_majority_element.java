import java.util.*;
public class s3_3_majority_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(arr));
		
	}
	private static int solution(int[] arr) {
		int nbytwo = arr.length/2;
		int c;
		int ans=-1;
		for(int i = 0;i<arr.length-1;i++) {
			c=1;
			int ele = arr[i];
			for(int j = i+1;j<arr.length;j++) {
				if(arr[j]==ele)	c++;
			}
			if(c>nbytwo) {
				ans = arr[i];
				break;
			}
		}
		return ans;
	}
}
