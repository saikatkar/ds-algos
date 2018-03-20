package arrays;

/**
 * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 * @author saikatkar
 *
 */
public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 12;
		int d =6;
		int [] array  = {1,2,3,4,5,6,7,8,9,10,11,12};
		for(int i = 0; i<gcd(d, n);i++) {
			
			int temp = array[i];
			int j =i;
			int k =0;
			while(true) {
				
				k =j+d;
				if(k>=n) {
					k = k-n;
				}
				if(k==i) {
					break;
				}
				array[j] = array[k];
				j=k;
			}
			array[j] = temp;
		}
		
		
		for(int i =0; i< array.length ; i++) {
			
			System.out.println(array[i]);
		}
		

	}
	
	public static int gcd(int a,int b) {
		   if(b==0)
		     return a;
		   else
		     return gcd(b, a%b);
		
	}

}
