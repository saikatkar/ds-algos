package practice;

/**
 * @author saikatkar
 *
 */
public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "XIXV";
		System.out.println(romanToInt(str));

	}
	
	 private static int value(char r)  { 
	       
		 	if (r == 'I') 
	            return 1; 
	        if (r == 'V') 
	            return 5; 
	        if (r == 'X') 
	            return 10; 
	        if (r == 'L') 
	            return 50; 
	        if (r == 'C') 
	            return 100; 
	        if (r == 'D') 
	            return 500; 
	        if (r == 'M') 
	            return 1000; 
	        return -1; 
	 } 
	 
	 private static int romanToInt(String str) {
		 
		 int result =0;
		 for(int i=0;i<str.length();i++) {
			 
			 char ch = str.charAt(i);
			 int value = value(ch);
			 
			 if(i+1 < str.length()) {
				 int valueNext = value(str.charAt(i+1));
				 
				 if(value < valueNext) {
					 result = result+ valueNext-value;
					 i++;
				 }else {
					 result += value;
				 }
			 }else {
				 
				 result += value;
			 }
		 }
		 
		 return result;
		 
	 }
	 

}
