import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Numberoccurance {

	public static void main(String[] args) {
		
		List<Integer> ar = Arrays.asList(1,2,1,2,2,2,2,1,3,3,1);
		
		Map<Integer, Integer> hm = new HashMap<Integer,Integer>();
		
		for (int i = 0; i < ar.size(); i++) {
			int key = ar.get(i);
			
			if (hm.containsKey(key)) {
				hm.put(key, hm.get(key) + 1);
			}
			else {
				hm.put(key, 1);
			}
		}
		// input[name="WHATEVER"] CSS selectors

		int largest = 0; // 0 is smaller that every value in hm
		Integer mostCommonKey = null;
		for( int key : hm.keySet() ) {
			int x = hm.get(key);
			
			if (x > largest) {
				largest = x;
				mostCommonKey = key;
			}
		}
		
		System.out.println(mostCommonKey + " was the most common number, occurring " + largest + " times.");
		
		
	}

}
