package arrays;

/**
 * There are n houses build in a line, each of which contains some value in it. A thief is going to steal the maximal value of these houses, but he can’t steal in two adjacent houses because owner of the stolen houses will tell his two neighbour left and right side. What is the maximum stolen value.

	Examples:
	
	Input  : hval[] = {6, 7, 1, 3, 8, 2, 4}
	Output : 19
	Thief will steal 6, 1, 8 and 4 from house.
	
	Input  : hval[] = {5, 3, 4, 11, 2}
	Output : 16
	Thief will steal 5 and 11
 * @author saikatkar
 *
 */
public class FindMaxPossibleStolenValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hval[] = {5, 3, 4, 11, 2};
		int n = hval.length;
		int dp [] = new int[n];
		dp[0] = hval[0];
		dp[1] = Math.max(hval[0],hval[1]);
		
		for(int i =2;i<n;i++) {
			dp[i] = Math.max(dp[i-2]+hval[i], dp[i-1]);
		}
		
		System.out.println(dp[n-1]);
	}

}
