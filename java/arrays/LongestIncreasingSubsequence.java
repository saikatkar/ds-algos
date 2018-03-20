package arrays;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 5, 3, 7, 11, 8, 10, 13,6};
		//int key =30;
		
		System.out.println(longestIncresingSubsequence(arr));
		//System.out.println(ceilIndex(new int[]{2,10,11,12,13}, 0, 4, 8));

	}
	
	public static int ceilIndex(int A[],int l,int r,int key) {
		
//		int m = (low+high)/2;
////		if(key<arr[0] || key>arr[arr.length-1]) {
////			return -1;
////		}
//		if(arr[m] == key) {
//			return m;
//		}
//		else if(arr[m]>key) {
//			if(arr[m-1]<key) {
//				return m;
//			}else {
//				return ceilIndex(arr, low, m-1, key);
//			}
//			
//		}
//		else {
//			if(arr[m+1]>key) {
//				return m+1;
//			}else {
//				return ceilIndex(arr, m+1, high, key);
//			}
//			
//		}
		while (r - l > 1)
        {
            int m = l + (r - l)/2;
            if (A[m]>=key)
                r = m;
            else
                l = m;
        }
 
        return r;
		
		
	}
	
	public static int longestIncresingSubsequence(int arr[]) {
		
		int T[] = new int[arr.length];
		T[0] = arr[0];
		int length =0;
		
		for(int i =1;i<arr.length;i++) {
		
			if(T[0]>arr[i]) {
				
				T[0] = arr[i];
			}else if(arr[i] > T[length]) {
				length++;
				T[length] = arr[i];
				
			}else {
				//System.out.println(arr[i]);
				int index = ceilIndex(T, 0, length, arr[i]);
				//System.out.println(index);
				T[index] = arr[i];
			}
		}
		
//		for(int i =0;i<=length;i++) {
//			System.out.print(T[i]+",");
//		}
//		System.out.println("");
		System.out.println(Arrays.toString(T));
		return length+1;
	}

}
