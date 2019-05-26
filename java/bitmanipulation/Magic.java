package bitmanipulation;


//Navi got a task at school to collect N stones. 
//Each day he can collect only one stone. 
//As N can be a very large number so it could take many days to complete the task, 
//but then he remembers that his mother gave him a magic that can double anything 
//(i.e if he has 2 stones, the magic will make them to 4 stones). 
//Navi can use this magic any number of time on the collected stone on a particular day and add this to the previously collected stones.
//Remember that he wants exactly N stones and he can't throw any stone.
//If he gets more than N stones then he gets 0 marks, of course he doesn't want 0 marks. 
//Help him to collect exactly N stones in minimum number of days.
//
//Input
//
//First line of input will contain number of test cases (T). 
//Then next T lines contains a single number N, which is number of stones Navi has to collect.
//
//Output
//
//For each test case, Print a single number which is the minimum number of days taken by Navi to complete the task.
//
//Constraints
//
//1 <= T <= 10^5
//
//0 <= N <= 10^9
public class Magic
{

	public static void main(String[] args)
	{
		long k = 3;//any value..read from input.
		
		long count =0;
		
		while(k !=0){
			
			k = k &(k-1);
			count ++;
			
		}
		
		System.out.println(count);

	}

}
