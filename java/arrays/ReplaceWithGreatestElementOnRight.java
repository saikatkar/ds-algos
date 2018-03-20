package arrays;

/**
 * Replace every element with the greatest element on right side<br>
   Given an array of integers, replace every element with the next greatest element (greatest element on the right side) in the array.<br> 
   Since there is no element next to the last element, replace it with -1. For example, if the array is {16, 17, 4, 3, 5, 2}, then it should be modified to {17, 5, 5, 5, 2, -1}.
 * @author saikatkar
 *
 */
public class ReplaceWithGreatestElementOnRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 5 ,7 ,1 ,2 ,3};
		int n = arr.length;
		int max = arr[n-1];
		arr[n-1] = -1;
		for(int i = n-2 ;i>=0;i--) {
			
			int temp = arr[i];
			arr[i] = max;
			if(temp>max) {
				max = temp;
			}
			
		}
		
		for(int i =0;i<n;i++) {
			System.out.print(arr[i]+",");
		}

	}

}
