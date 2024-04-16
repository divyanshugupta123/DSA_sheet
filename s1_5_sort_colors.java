import java.util.*;
public class s1_5_sort_colors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0 ; i<arr.length;i++) {
			arr[i] = sc.nextInt();
			
		}
//		firstWay(arr);
		DNF(arr);
		
		
		
	}
	private static void firstWay(int[] arr) {
		int zc =0,oc=0,tc=0;
		for(int i = 0 ; i <arr.length;i++) {
			if(arr[i] == 0) {
				
				zc++;
			}
			else if(arr[i] == 1){
				oc++;
			}
			else {
				tc++;
			}
		}
		for(int i = 0; i<zc;i++) {
			arr[i] = 0;
		}
		for(int i = zc; i < oc + zc; i++) {
		    arr[i] = 1;
		}

		for(int i = oc + zc; i < arr.length; i++) {
		    arr[i] = 2;
		}
		display(arr);
	}
	
	
//	in second way we're using DNF Dutch national flag
	private static void DNF(int[] arr) {
		int low = 0,mid = 0,high = arr.length-1;
		while(mid<=high) {
			if(arr[mid]==0) {
				swap(arr,low,mid);
				low++;mid++;
			}
			else if(arr[mid]==1) {
				mid++;
			}
			else {
				swap(arr,high,mid);
				high--;
			}
		}
		display(arr);
	}
	private static void swap(int[] arr, int a, int b) {
	    arr[a] = arr[a] ^ arr[b];
	    arr[b] = arr[a] ^ arr[b];
	    arr[a] = arr[a] ^ arr[b];
	}


	
	
	private static void display(int[] arr) {
		System.out.print("[");
		for(int i = 0 ; i < arr.length;i++) {
			if(i==arr.length-1) {
				System.out.print(arr[i]);
			}else {
				System.out.print(arr[i]+",");
			}
			
		}
		System.out.print("]");
		
	}

}
