package dynamic_programming;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,2,3,6,10,1,5};
		System.out.println(lis(arr, 0));
	}
	
	public static int lis(int arr[],int start) {
		
		if(start>=arr.length) {
			return 0;
		}
		int maxLength =1;
		//int end = start+1;
		int number = arr[start];
		for(int index = start+1;index<arr.length;index++) {
			
			if(number < arr[index] ) {
				maxLength ++;
				number = arr[index];
			}
		}
		maxLength = Math.max(maxLength, lis(arr,start+1));
		return maxLength;
	}

}
