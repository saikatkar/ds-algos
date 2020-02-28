package practice;

public class Snippet {
	
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,20,25,30,40};
		System.out.println(findIndexForNumber(arr, 0, arr.length-1, 24));

	}
	private static int findIndexForNumber(int arr[],int low,int high,int k) {
			
			int m = high - (high-low)/2;
			if(high<low) {
					return high;
			}else if( arr[m]<k) {
				return findIndexForNumber(arr, m+1, high, k);
			}else {
				return findIndexForNumber(arr, low, m-1, k);
			}
		}
}

