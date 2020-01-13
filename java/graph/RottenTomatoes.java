package graph;

import java.util.LinkedList;
import java.util.Queue;

public class RottenTomatoes {
	
	private static int r=3;
	private static int c=4;
	
	public static class Entry{
		
		public int x;
		public int y;
		
		public Entry(int x,int y) {
			
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { {2, 1, 0, 2, 1}, 
                {1, 0, 1, 2, 1}, 
                {1, 0, 0, 2, 1}}; 
		int ans = ifPossibleRotOranges(arr); 
		if(ans == -1) 
		    System.out.println("All oranges cannot rot"); 
		else
		    System.out.println("Time required for all oranges to rot = " + ans); 

	}
	
	public static int ifPossibleRotOranges(int [][] arr) {
		
		Queue <Entry> queue = new LinkedList<Entry>();
		int ans =0;
		
		for(int i = 0;i<r;i++) {
			for(int j =0;j<c;j++) {
				if(arr[i][j] == 2) {
					Entry entry = new Entry(i,j);
					queue.add(entry);
				}
			}
		}
		queue.add(new Entry(-1,-1));
		
		while(!queue.isEmpty()) {
			
			
			
			boolean flag = false;
			
			while(!isDelim(queue.peek())) {
				Entry temp = queue.poll();
				
				// Check right adjacent cell that if it can be rotten 
                if(isValid(temp.x+1, temp.y) && arr[temp.x+1][temp.y] == 1) 
                { 
                    if(!flag) 
                    { 
                        // if this is the first orange to get rotten, increase 
                        // count and set the flag. 
                        ans++; 
                        flag = true; 
                    } 
                    // Make the orange rotten 
                    arr[temp.x+1][temp.y] = 2; 
                      
                    // push the adjacent orange to Queue 
                    temp.x++; 
                    queue.add(new Entry(temp.x,temp.y)); 
                      
                    // Move back to current cell 
                    temp.x--; 
                }
                // Check left adjacent cell that if it can be rotten 
                if(isValid(temp.x-1, temp.y) && arr[temp.x-1][temp.y] == 1) 
                { 
                    if(!flag) 
                    { 
                        // if this is the first orange to get rotten, increase 
                        // count and set the flag. 
                        ans++; 
                        flag = true; 
                    } 
                    // Make the orange rotten 
                    arr[temp.x-1][temp.y] = 2; 
                      
                    // push the adjacent orange to Queue 
                    temp.x--; 
                    queue.add(new Entry(temp.x,temp.y)); 
                      
                    // Move back to current cell 
                    temp.x++; 
                }
                // Check top adjacent cell that if it can be rotten 
                if(isValid(temp.x, temp.y-1) && arr[temp.x][temp.y-1] == 1) 
                { 
                    if(!flag) 
                    { 
                        // if this is the first orange to get rotten, increase 
                        // count and set the flag. 
                        ans++; 
                        flag = true; 
                    } 
                    // Make the orange rotten 
                    arr[temp.x][temp.y-1] = 2; 
                      
                    // push the adjacent orange to Queue 
                    temp.y--; 
                    queue.add(new Entry(temp.x,temp.y)); 
                      
                    // Move back to current cell 
                    temp.y++; 
                }
                // Check bottom adjacent cell that if it can be rotten 
                if(isValid(temp.x, temp.y+1) && arr[temp.x][temp.y+1] == 1) 
                { 
                    if(!flag) 
                    { 
                        // if this is the first orange to get rotten, increase 
                        // count and set the flag. 
                        ans++; 
                        flag = true; 
                    } 
                    // Make the orange rotten 
                    arr[temp.x][temp.y+1] = 2; 
                      
                    // push the adjacent orange to Queue 
                    temp.y++; 
                    queue.add(new Entry(temp.x,temp.y)); 
                      
                   }
				
			}
			
			queue.poll();
			if(!queue.isEmpty()) {
				
				queue.add(new Entry(-1,-1));
			}
			
			
		}
		
		return checkAll(arr) ? -1 : ans ;
	}
	
	public static boolean isDelim(Entry entry) {
		
		return entry.x == -1 ? true : false;
	}
	
	public static boolean isValid(int x,int y) {
		
		if(x <0 || y >=c || y <0 || x >=r) {
			return false;
		}else {
			return true;
		}
	}
	
	public static boolean checkAll(int arr[][]) {
		for(int i = 0;i<r;i++) {
			for(int j =0;j<c;j++) {
				if(arr[i][j] == 1) {
					return true;
				}
			}
		}
		return false;
	}

}
