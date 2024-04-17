import java.util.*;
public class s2_4_find_duplicate_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		int[] arr = {1,3,4,2,2};
		
		
	}
	private static int solution(int[] arr) {
		Arrays.sort(arr);
		for(int i = 0;i<arr.length-1;i++) {
			if(arr[i] == arr[i+1]) {
				return arr[i];
			}
		}
		return -1;
	}
	private static int returnDup(int[] arr) {
		for(int i = 0 ; i<arr.length-1;i++) {
			int temp = arr[i];
			for(int j = i+1;j<arr.length;j++) {
				if(temp==arr[j]) {
					return temp;
				}
			}
			
		}
		return -1;
	}

}
