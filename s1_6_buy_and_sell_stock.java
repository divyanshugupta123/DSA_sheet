import java.util.*;
public class s1_6_buy_and_sell_stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =  0 ; i < arr.length;i++) {
			arr[i] = sc.nextInt();
			
		}
		System.out.println(jdaProfit(arr));
		
	}
	private static int jdaProfit(int[] arr) {
		int min = arr[0];
		int maxProfit = 0;
		
		if(arr==null || arr.length <2) {
			return 0;
		}
		
		for(int i = 1; i <arr.length;i++) {
			min = Math.min(min, arr[i]);
			
			int curProfit = arr[i] - min;
			maxProfit = Math.max(maxProfit, curProfit);
		}
		
		
		
		return maxProfit;
		
	}

}
