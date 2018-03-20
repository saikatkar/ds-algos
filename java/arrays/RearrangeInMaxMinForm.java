package arrays;

/**
 * Given a sorted array of positive integers, rearrange the array alternately i.e<br>
 * first element should be the maximum value, <br>
 * second minimum value, third-second max, fourth-second min and so on.<br>
 * @author saikatkar
 *
 */
public class RearrangeInMaxMinForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int n = arr.length;
		int min_indx = 0;
		int max_indx = n-1;
		int max_elem = arr[n-1]+1;
		
		for(int i =0;i<n;i++) {
			//If i is even
			if((i&1) ==0) {
				
				arr[i] += (arr[max_indx]%max_elem)*max_elem;
				max_indx--;
			}else {
				
				arr[i] += (arr[min_indx]%max_elem)*max_elem;
				min_indx++;
			}
			
			
		}
		
		for(int i =0;i<n;i++) {
			System.out.print(arr[i]/max_elem +",");
		}

	}

}
