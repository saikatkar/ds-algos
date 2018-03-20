package arrays;

import java.util.HashMap;
import java.util.Map;

public class FindSubarrayWithGivenSumNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =  {10, 2, -2, -20, 11};
		int n = arr.length;
		int x = 0;
		int currentSum = 0;
		boolean isFound = false;
		Map<Integer,Integer> map = new HashMap<>();
		//map.put(0, 0);
		for(int i =0;i<n;i++) {
			
			currentSum+=arr[i];
			if(currentSum==x) {
				isFound =true;
				System.out.println("Sum found between indexes "+0+" and "+i);
				break;
			}
			if(map.get(currentSum-x)!=null) {
				isFound =true;
				System.out.println("Sum found between indexes "+(map.get(currentSum-x).intValue()+1)+" and "+(i));
				break;
			}
			map.put(currentSum, i);
			
			
				
		}
		if(!isFound) {
			System.out.println("No subarray found with given sum");
		}

	}
}
