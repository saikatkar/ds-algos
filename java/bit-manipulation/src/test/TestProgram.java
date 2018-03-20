package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;



public class TestProgram
{

	public static void main(String[] args) throws ParseException, CloneNotSupportedException, IOException
	{
		// TODO Auto-generated method stub
		
//		Integer i1 = 127;
//		Integer i2 = 127;
//		
//		Integer i3 =1000;
//		Integer i4 =1000;
//		
//		
//		System.out.println(i1 ==i2);
//		System.out.println(i3 == i4);

		//HashMap<String,String> map = new HashMap<String,String>();
//		
//		Calendar cal = Calendar.getInstance();
//		cal.setFirstDayOfWeek(Calendar.MONDAY);
//		
//		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//		cal.setTime(df.parse("2017-06-02"));
//		
//		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
//		
//		String s ="";
//		System.out.println(s.equals(null));
		
		//Test test = new Test();
		
//		LinkedHashMap<String, String> map = new LinkedHashMap<>();
//		System.out.println(map instanceof LinkedHashMap);
//		System.out.println(map instanceof HashMap);
//		
//		Test test = new Test();
		
//		TestB testb = new TestB();
//		testb.printA2();
		
		
//		Foo a = new Foo(new Integer(10), new Integer(20));
//		Foo b = new Foo(new Integer(5), new Integer(10));
//
//		Foo c = new Foo(a, b);
//		Foo d = new Foo(c, a);
//
//		Integer sum = d.sumOfLeftAndRight();
//		System.out.println(sum);
		// sum would be 10 + 20 + 5 + 10 + 9 = 54;
		
//		Set<?> set  = null;
//		set.add("s");
		
		int N = 5;
		int k = 3;
		int [] numbers = {6,1,2,3,7};
		List<Integer> oneCounts = new ArrayList<Integer>(N);
		for(int i =0 ; i<N ;i++){
			
			oneCounts.add(i, countOne(numbers[i])); 
		}
		Collections.sort(oneCounts,new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2)
			{
				// TODO Auto-generated method stub
				return  (o2-o1);
			}
			
			
			
		} );
		int result =0;
		for(int j =0 ;j < k ;j++){
			
			result = result + oneCounts.get(j);
		}
		
        
		System.out.println(result);
		System.out.println(1^9);
	}
	
	
	
	private static int countOne(int n) throws CloneNotSupportedException{
		
		int count = 0;
		while(n !=0){
			
			n = n & (n-1);
			count ++;
		}
		return count;
	}

}
