package arrays;

/**
 * Given an array and a range [lowVal, highVal], partition the array around the range such that array is divided in three parts.<br><br>
   1) All elements smaller than lowVal come first.<br>
   2) All elements in range lowVal to highVVal come next.<br>
   3) All elements greater than highVVal appear in the end.<br>
 * @author saikatkar
 *
 */
public class ThreeWayPartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 14, 5, 20, 4,15, 2, 54, 20, 87, 98, 3, 1, 32};
		int n = arr.length;
		threeWayPartition(arr, 14, 20);
		
		for(int i =0;i<n;i++) {
			
			System.out.print(arr[i]+",");
		}
		
		

	}
	
	public static void threeWayPartition(int arr[],int lowVal,int highVal) {
		
		
		int start = 0;
		int end = arr.length-1;
		
		for(int i =0;i<=end;) {
			
			if(arr[i]<lowVal) {
				
				int temp = arr[i];
				arr[i] = arr[start];
				arr[start] = temp;
				i++;
				start++;
			}else if(arr[i]>highVal) {
				
				int temp = arr[i];
				arr[i] = arr[end];
				arr[end] = temp;
				end--; 
			}else {
				i++;
			}
			
		}
	}

}
