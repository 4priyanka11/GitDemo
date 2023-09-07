package practice.array;

public class Buy_Sell_Stocks {

	public static void main(String[] args) {
		int arr[] = {7,1,5,3,6,4};
		
		System.out.println("Profit:"+buy_sell_stocks(arr));
		
	}
	
	public static int buy_sell_stocks(int arr[]){
		int buy= Integer.MAX_VALUE;
		int buy_index=0;
		
		for(int i= 0; i <= arr.length-1 ; i++) {
			if(buy>arr[i]) {
				buy = arr[i];
				buy_index= i;
			}
		}
		
		int sell=buy;
		for(int i= buy_index+1; i <= arr.length-1 ; i++) {
			if(sell<arr[i]) {
				sell= arr[i];
			}
		}
		
		int profit = sell-buy;
		
		return profit;
	}
	

	

}
