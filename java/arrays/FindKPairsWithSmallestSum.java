package arrays;

/**
 * Given two integer arrays arr1[] and arr2[] sorted in ascending order and an integer k.<br> 
 * Find k pairs with smallest sums such that one element of a pair belongs to arr1[] and other element belongs to arr2[]
 * <br>
 *  Input :  arr1[] = {1, 7, 11}<br>
	         arr2[] = {2, 4, 6}<br>
	         k = 3<br>
	Output : [1, 2],<br>
	         [1, 4],<br>
	         [1, 6]<br>
	Explanation: The first 3 pairs are returned 
	from the sequence [1, 2], [1, 4], [1, 6], 
	[7, 2], [7, 4], [11, 2], [7, 6], [11, 4], 
	[11, 6]
 * @author saikatkar
 *
 */
public class FindKPairsWithSmallestSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1 [] ={1, 3, 11};
		int arr2 [] = {2, 6, 7};
		int n1 = arr1.length;
		int n2 = arr2.length;
		int k=5;
		
		//int i = 0,j = 0;
		//
		int []index2 = new int[n1];
		while(k>0) {
			int minSum = Integer.MAX_VALUE;
			int minIndex = 0;
			
			for(int i = 0;i<n1;i++) {
				
				if(index2[i]<n2 && (arr1[i]+arr2[index2[i]] < minSum)) {
					
					minIndex = i;
					minSum = arr1[i]+arr2[index2[i]];
				
				}
				
			}	
			System.out.println("["+arr1[minIndex]+","+arr2[index2[minIndex]]+"]");
			index2[minIndex]++;
			k--;
			
		}
		

	}
		
		
		



}
