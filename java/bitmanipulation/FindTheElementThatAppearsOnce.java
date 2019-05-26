package bitmanipulation;

/**
 * Find the element that appears once
	Given an array where every element occurs three times, except one element which occurs only once.<br> 
	Find the element that occurs once. Expected time complexity is O(n) and O(1) extra space.
 * @author saikatkar
 *
 */
public class FindTheElementThatAppearsOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numbers = {5,4,4,4,3,3,3,2,2,2};
		int k =3;
		int sum =0;
		int x =0;
		int result =0;
		for(int i =0;i<32;i++) {
			sum =0;
			x = 1<<i;
			
			for(int j =0 ;j<numbers.length;j++) {
				
				if((numbers[j] & x) != 0) {
					sum++;
				}
			}
			
			if((sum % k) !=0) {
				
				result |=x;
			}
			
		}
		System.out.println(result);
		
	}

}
