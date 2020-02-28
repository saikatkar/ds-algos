package practice;

/**
 * Given arrival and departure times of all trains that reach a railway station. Your task is to find the minimum number of platforms required for the railway station so that no train waits.

Note: Consider that all the trains arrive on the same day and leave on the same day. Also, arrival and departure times will not be same for a train, but we can have arrival time of one train equal to departure of the other.

In such cases, we need different platforms, i.e at any given instance of time, same platform can not be used for both departure of a train and arrival of another.


 * @author saikatkar
 *
 */
public class MinimumPlatforms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1 []= {900 , 1100,1235};
		int arr2 [] = {1000, 1200, 1240};

		
		System.out.println(findNoOfPlatforms(arr1, arr2));

	}
	private static int findNoOfPlatforms(int arr1[],int arr2[]) {
		int count =1;
		int maxTime = arr2[0];
		int curCount =1;
		
		for(int i=1;i<arr1.length;i++) {
			
			if(arr1[i] < maxTime) {
				if(curCount >= count) {
					count++;
				}
				curCount++;
			}
			if(arr2[i] > maxTime) {
				maxTime = arr2[i];
				curCount =1;
			}
		}
		return count;
		
		
	}

}
