package practice;

/**
 * @author saikatkar
 *
 */
public class RainWaterTrapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		System.out.println(totalWaterTrapped(arr));

	}
	
	
	public static int totalWaterTrapped(int [] arr) {
		
		int maxR = 0,maxL =0;
		int l =0;
		int h = arr.length-1;
		int total =0;
		
		while(l<=h) {
			
			if(arr[l] < arr[h]) {
				
				if(arr[l] > maxL) {
					maxL = arr[l];
				}
				total += maxL-arr[l];
				l++;
			}else {
				
				if(arr[h] > maxR) {
					maxR = arr[h];
				}
				total += maxR-arr[h];
				h--;
			}
		}
		return total;
	}

}
