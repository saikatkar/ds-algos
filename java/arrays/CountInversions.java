package arrays;

public class CountInversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This problem can be solved using enhanced merge sort.
		
		int arr[] = {1, 20, 6, 4, 5};
		int temp[] = new int[arr.length];
		System.out.println(mergeSort(arr, temp, 0, arr.length-1));
		

	}
	
	public static int mergeSort(int arr[],int temp[],int left,int right) {
		
		int mid,invCount = 0;
		if(right>left) {
			
			mid = (right+left)>>>1;
			
			invCount=mergeSort(arr, temp, left, mid);
			invCount+=mergeSort(arr, temp, mid+1, right);
			
			invCount+=merge(arr, temp, left, mid+1, right);
			
			return invCount;
			
			
			
		}
		
		return invCount;
	}
	
	public static int merge(int arr[],int temp[],int left,int mid,int right) {
		
		int i = left;
		int j = mid;
		int k = left;
		int invcount =0;
		while(i<=(mid-1) && j<=right) {
			if(arr[i]<arr[j]) {
				
				temp[k++] = arr[i++];
			}else {
				
				temp[k++] = arr[j++];
				
				invcount+= mid-i;
			}
		}
		
		while(i<=mid-1) {
			temp[k++] = arr[i++];
		}
		
		while(j<=right) {
			
			temp[k++] = arr[j++];
		}
		
		for(int m =left;i<=right;i++) {
			
			arr[m] = temp[m];
		}
		
		return invcount;
		
	}

}
