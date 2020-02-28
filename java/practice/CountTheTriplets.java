package practice;

import java.util.Arrays;

public class CountTheTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,5,3,2,4};
		System.out.println(countTheTriplets(arr));

	}
	
	private static int countTheTriplets(int [] arr) {
		
		Arrays.sort(arr);
		int count =0;
		for(int i=arr.length-1;i>0;i--) {
			
			int j=0;
			int k = i-1;
			while(j<k) {
				
				if(arr[j]+arr[k] == arr[i]) {
					count++;
					System.out.println("("+arr[j]+","+arr[k]+","+arr[i]+")");
					j++;
					k--;
				}else if(arr[j]+arr[k] > arr[i]) {
					k--;
				}else {
					j++;
				}
			}
		}
		return count;
	}

}
