package tree;

public class NodeDetails extends Node {

	public int minValue;
	
	public int maxValue;
	
	NodeDetails(int key,int min,int max) {
		super(key);
		this.maxValue = max;
		this.minValue = min;
	}
	
	

	

}
