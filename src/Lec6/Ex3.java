package Lec6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex3 {

	public static void main(String[] args) {

		// Create a hash map.
		HashMap<String, Double> hm = new HashMap<String, Double>();
		
		//<Key, Value>

		// Put elements to the map
		hm.put("John Doe", new Double(3434.34));
		hm.put("Tom Smith", new Double(123.22));
		hm.put("Jane Baker", new Double(1378.00));
		hm.put("Tod Hall", new Double(99.22));
		hm.put("Ralph Smith", new Double(-19.08));

		// Get a set of the entries.
		Set<Map.Entry<String, Double>> set = hm.entrySet();
		
		//For display HashMap we convert it into Set 

		// Display the set.
		for (Map.Entry<String, Double> me : set) {
			System.out.print(me.getKey() + " : " + me.getValue());
			System.out.println();
		}
		
		// Deposit 1000 into John Doe's account.
		double balance = hm.get("John Doe");
		hm.put("John Doe", balance + 1000);		
		System.out.println("John Doe's new balance : " + hm.get("John Doe"));

	}

}
