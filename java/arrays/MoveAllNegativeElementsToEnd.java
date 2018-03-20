package arrays;

/**
 * @author saikatkar
 *
 */
public class MoveAllNegativeElementsToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1 ,-1 ,-3 , -2, 7, 5, 11, 6 };
		int n =arr.length;
		int j =-1;
		
		for(int i =0;i<n;i++) {
			
			if(arr[i]>0) {
				j++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		
		for(int i = 0; i<n;i++) {
			System.out.print(arr[i]+",");
		}

	}

}
