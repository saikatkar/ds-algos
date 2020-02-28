package practice;

/**
 * @author saikatkar
 *
 */
public class ElementWithLeftSideSmallerRightSideGreater {
	
	public static void main(String args[]) {
		
		int [] arr = {4,3,2,5,7,8,9};
		int [] arr1 = {1,1,1,1};
		int [] arr2 = {11,10,13};
		findFirstElement(arr2);
		
	}
	
	private static void findFirstElement(int arr[]) {
		
		boolean temp [] = new boolean[arr.length];
		
		temp[0] = false;
		temp[arr.length-1] = false;
		int max = arr[0];
		for(int i=1;i<arr.length-1;i++) {
			
			if(arr[i] > max) {
				max = arr[i];
				temp[i] = true;
			}else {
				temp[i] = false;
			}
		}
		int min = arr[arr.length-1];
		for(int i = arr.length-2;i>=0;i--) {
			
			if(arr[i] < min) {
				min = arr[i];
				temp[i] &= true;
			}else {
				temp[i] &= false;
			}
		}
		boolean flag = false;
		for(int i=0;i<temp.length;i++) {
			if(temp[i]) {
				System.out.println(i);
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("-1");
		}
		
	}

}
