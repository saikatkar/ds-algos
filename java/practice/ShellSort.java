package practice;

import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {12 ,34 ,54, 2, 3};
		shellsort(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}
	
	private static void shellsort(int arr[],int n) {
		
		for(int gap =n/2;gap>=1;gap=gap/2) {
			
			for(int i =gap;i<n;i++) {
				int temp = arr[i];
				int j=i;
				for(j=i ;j >=gap && arr[j-gap]>arr[j]; j-=gap) {
					
					arr[j] = arr[j-gap];
				}
				arr[j] = temp;
			}
		}
		
	}

}
