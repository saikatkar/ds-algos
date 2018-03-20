package arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given an array of numbers, arrange them in a way that yields the largest value.<br>
 *  For example, if the given numbers are {54, 546, 548, 60}, the arrangement 6054854654 gives the largest value.<br>
 *   And if the given numbers are {1, 34, 3, 98, 9, 76, 45, 4}, 
 * then the arrangement 998764543431 gives the largest value.
 * @author saikatkar
 *
 */
public class ArrangeNumbersToFormBiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1, 34, 3, 98, 9, 76, 45, 4};
		printLargest(arr);

	}
	
	public static void printLargest(int arr[]) {
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				String XY = o1.toString() + o2.toString();
				String YX = o2.toString() + o1.toString();
				
				return XY.compareTo(YX) > 0 ?-1:1; 
			}
		});
		for(Integer i : list) {
			System.out.print(i);
		}

	}
}
