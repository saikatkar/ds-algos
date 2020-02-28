package practice;

public class AllPermutationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABC";
		permutate(str, 0, str.length()-1);

	}
	
	private static void permutate(String str,int left,int right) {
		
		if(left == right) {
			System.out.println(str);
		}
		
		for(int i=left;i<=right;i++) {
			
			String word = swap(str, left, i);
			permutate(word, left+1, right);
		}
		
	}
	
	private static String swap(String str,int i,int j) {
		
		char[] arr = str.toCharArray();
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		return String.valueOf(arr);
	}

}
