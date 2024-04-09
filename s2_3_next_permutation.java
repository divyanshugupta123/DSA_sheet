import java.util.*;

public class s2_3_next_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0 ; i<arr.length;i++) {
			arr[i] = sc.nextInt();
			
		}
		nextPermutation(arr);
		
	}
	private static void nextPermutation(int[] arr) {
		int idx = -1;
		for(int i = arr.length-2;i>=0;i--) {
			if(arr[i]<arr[i+1]) {
				idx = i;
				break;
			}
			
		}
		if(idx == -1) {
			reverse(arr,0,arr.length-1);
		}
		else {
			for(int i = arr.length-1;i>=idx;i--) {
				if(arr[i]>arr[idx]) {
					swap(arr,i,idx);
					break;
				}
				
			}
			reverse(arr,idx+1,arr.length-1);
		}
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
		    if(i == arr.length - 1) {
		        System.out.print(arr[i]);
		    } else {
		        System.out.print(arr[i] + ",");
		    }
		}
		System.out.print("]");

		
		
	}
	private static void swap(int[] arr,int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}

	private static void reverse(int[] arr , int start ,int end) {
		
		
        while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
  
	}
}
