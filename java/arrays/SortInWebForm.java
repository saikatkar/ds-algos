package arrays;

/**
 * Given an unsorted array of integers, sort the array into a wave like array.<br> 
 * An array ‘arr[0..n-1]’ is sorted in wave form if <br>
 * arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= …..
 * @author saikatkar
 *
 */
public class SortInWebForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10, 90, 49, 2, 1, 5, 23};
        int n = arr.length;
		for(int i = 0;i<n;i=i+2) {
			
			if(i>0 && arr[i-1]>arr[i]) {
				swap(arr,i-1,i);
			}
			
			if(i<n-1 && arr[i+1] > arr[i]) {
				
				swap(arr,i+1,i);
			}
			
		}
		
		for(int i = 0;i<n;i++) {
			System.out.print(arr[i]+",");
			
		}

	}
	// A utility method to swap two numbers.
    public static void swap(int arr[], int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
