package trie;

import java.util.List;

/**
 * @author saikatkar
 *
 */
public class TrieSTMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TrieST trieST = new TrieST();
		
		trieST.insert("cat");
		trieST.insert("cap");
		trieST.insert("caption");
		trieST.insert("cataclysmic");
		trieST.insert("captain");
		trieST.insert("captaincy");

		
		List<String> list = trieST.startWithKeys("capt");
		
		System.out.println(list);
		
		
		

	}

}
