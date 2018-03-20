package arrays;

/**
 * Given an array of n integers, find the 3 elements such that a[i] < a[j] < a[k] and i < j < k in 0(n) time.
 * <br> If there are multiple such triplets, then print any one of them.
 *  <br><br>
 *  Input:  arr[] = {12, 11, 10, 5, 6, 2, 30}<br>
	Output: 5, 6, 30<br><br>   
	
	Input:  arr[] = {1, 2, 3, 4}<br>
	Output: 1, 2, 3 OR 1, 2, 4 OR 2, 3, 4<br><br>
	
	Input:  arr[] = {4, 3, 2, 1}<br>
	Output: No such triplet<br>
 * @author saikatkar
 *
 */
public class SortedSubsequenceOfSize3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 11, 10, 5, 6, 2, 30};
	    int n = arr.length;
	    int greater [] = new int[n];
	    int smaller [] = new int[n];
	    smaller[0] = -1;
	    greater[n-1] = -1;
	    int min = 0;
	    int max =n-1;
	    for(int i =1	;i<n;i++) {
	    	
	    		if(arr[i]<=arr[min]) {
	    			smaller[i] = -1;
	    			min =i;
	    		}else {
	    			smaller[i]=min;
	    		}
	    }
	    
	    for(int i =n-2;i>=0;i--) {
	    	
	    		if(arr[i]>=arr[max]) {
	    			greater[i] = -1;
	    			max =i;
	    		}else {
	    			greater[i]=max;
	    		}
	    }
	    
	    for(int i=0;i<n;i++) {
	    	
	    		if(smaller[i]!=-1 && greater[i]!=-1) {
	    			System.out.print(arr[smaller[i]]+","+arr[i]+","+arr[greater[i]]);
	    			
	    		}

	}

 }
}
