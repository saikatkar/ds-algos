package string;

/**
 * iven a large number as string s and an integer k which denotes the number of breakpoints we must put in the number k <= string length. The task is to find maximum segment value after putting exactly k breakpoints.

Examples:

Input : s = "8754", k = 2
Output : Maximum number = 87
Explanation : We need to two breakpoints. After
putting the breakpoints, we get following options
8 75 4
87 5 4
The maximum segment value is 87.

Input : s = "999", k = 1 
Output : Maximum Segment Value = 99
Explanation : We need to one breakpoint. After
putting the breakpoint, we either get 99,9 or
9,99.

 * @author saikatkar
 *
 */
public class MaxSegmentValueAfterPuttingKBreakPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "9999"; int k =2 ;
		System.out.println(findMaxSegment(s, k));

	}
	
	public static int findMaxSegment(String s,int k) {
		int max =0;
		int window = s.length() - k;
		int result = 0;
		
		for (int i =0;i<window;i++) {
			result+=(int)(s.charAt(i)-'0')*Math.pow(10, window-i-1);
		}
		max = result;
		//1st window value calculated
		//Start with the next windows
		for(int i =1;i<s.length()-window;i++) {
			
			result -= (int)(s.charAt(i)-'0')*Math.pow(10, window-1);
			result *= 10;
			result =+ (int)(s.charAt(i+window-1)-'0');
			
			result = result >max ? result : max;
		}
		return max;
	}

}
