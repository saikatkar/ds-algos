package arrays;

/**
 * Longest Span with same Sum in two Binary arrays

	Given two binary arrays arr1[] and arr2[] of same size n. Find length of the longest common span (i, j) where j >= i such that arr1[i] + arr1[i+1] + …. + arr1[j] = arr2[i] + arr2[i+1] + …. + arr2[j].
	
	Expected time complexity is Θ(n).
	
	Examples:
	
	Input: arr1[] = {0, 1, 0, 0, 0, 0};
	       arr2[] = {1, 0, 1, 0, 0, 1};
	Output: 4
	The longest span with same sum is from index 1 to 4.
	
	Input: arr1[] = {0, 1, 0, 1, 1, 1, 1};
	       arr2[] = {1, 1, 1, 1, 1, 0, 1};
	Output: 6
	The longest span with same sum is from index 1 to 6.
	
	Input: arr1[] = {0, 0, 0};
	       arr2[] = {1, 1, 1};
	Output: 0
	
	Input: arr1[] = {0, 0, 1, 0};
	       arr2[] = {1, 1, 1, 1};
	Output: 1

 * @author saikatkar
 *
 */
public class LongestSpanWithSameSum {
	
	public static void main(String [] args) {
		
		int arr1[] = {0, 1, 0, 1, 1, 1, 1};
	    int arr2[] = {1, 1, 1, 1, 1, 0, 1};
	    
	    int n = arr1.length;
	    
	    
	    int diff[] = new int[2*n+1];
	    for(int i =0;i<diff.length;i++) {
	    		diff[i] =-1;
	    }
	    int maxLen = 0;
	    int diffIndex = 0;
	    int presum1=0;
	    int presum2=0;
	    for(int i=0;i<n;i++) {
	    		
	    		 presum1 +=arr1[i];
	    		 presum2 +=arr2[i]; 
	    		 int currDiff = presum1-presum2;
	    		 diffIndex = n+currDiff;
	    		 int len = 0;
	    		 //If currdiff is 0 that means there are equal no of 1s in the  span.
	    		 if(currDiff == 0) {
	    			 maxLen =i;
	    			 
	    			 //this means visiting the diff array for the first time
	    		 }else if(diff[diffIndex]==-1) {
	    			 diff[diffIndex] = i;
	    		 }else {
	    			 len = i-diff[diffIndex];
	    		 }
	    		 
	    		 if(len>maxLen) {
	    			 maxLen = len;
	    		 }
	    }
	    
	    System.out.println(maxLen);
		
	}

}
