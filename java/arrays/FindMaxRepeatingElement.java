package arrays;

import java.util.Arrays;

/**
 * @author saikatkar
 *
 */
public class FindMaxRepeatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 3, 3, 5, 3, 4, 1, 7};
		int n = arr.length;
		for(int i =0;i<n;i++) {
			
			int temp = arr[i]%n;
			arr[temp] = (arr[temp]%n)+(arr[temp]/n + 1)*n;
		}
		int max =0;
		int maxNo = -1;
		for(int i =0;i<n;i++) {
			if(arr[i]/n>max) {
				max = arr[i]/n;
				maxNo =i;
			}
		}
		System.out.println("Max Number "+maxNo);
		System.out.println("Max Count "+max);
	}

}
