package practice;

public class StockBuyAndSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {23,13,25,29,33,19,34,45,65,5};
		int [] arr1 = {100 ,180, 180,260, 310, 40, 535, 695};
		int [] arr2 = {3,3,3,3,3};
		
		findBuyAndSellDate(arr1);
	}
	
	private static void findBuyAndSellDate(int arr[]) {
		
		int start=0,end =0;
		boolean flag = false;
		int i =0;
		
		for(;i<arr.length-1;i++) {
			
			if(arr[i+1]>arr[i] && !flag) {
				start =i;
				flag = true;
			}
			if(arr[i+1]< arr[i]) {
				end =i;
				if(start!=end) {
					System.out.println("("+start+","+end+")");
				}
				flag = false;
			}
		}
		
		if(start == end ) {
			System.out.println("No Profit");
		}
		if(flag){
			System.out.println("("+start+","+i+")");
		}
	}

}
