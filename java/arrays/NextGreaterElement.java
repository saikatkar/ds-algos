package arrays;

import java.util.Stack;

/**
 * @author saikatkar
 *
 */
public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {4,3,2,1};
		int n = arr.length;
		Stack<Integer> stack = new Stack<Integer>();
		for(int i =0;i<n;i++) {
			if(!stack.isEmpty()) {
				//int top = stack.peek();
				while( !stack.isEmpty() && arr[i]>stack.peek() ) {
					int top = stack.pop();
					System.out.println(top+" ---> "+arr[i]);
				}
			}
			stack.push(arr[i]);
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop()+" ---> "+"-1");
		}
	}

}
