package practice;

public class QuickSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {10,5,8,3,12,15,6};
		System.out.println(quickSelect(arr, 0, arr.length-1, 3));
	}
	
	public static int quickSelect(int arr[],int low,int high,int k) {
		if(k > arr.length) {
			System.out.println("K should be less or equal to "+ (arr.length));
			return -9999;
		}
		
		int pIndex = pivot(arr, low, high);
		if(pIndex+1 == k) {
			return arr[pIndex];
		}else if(pIndex+1 > k) {
			return quickSelect(arr, low, pIndex-1, k);
		}else {
			return quickSelect(arr, pIndex+1, high, k);
		}
		
		//return pIndex;
	}
	
	public static int pivot(int arr[],int low,int high) {
		
		int i = low-1;
		int pivot = arr[high];
		
		for(int j=low;j<high;j++) {
			if(arr[j]<=pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);
		return i+1;
	}
 	
	public static void swap(int arr[],int i,int j) {
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	

}
