package CodingPractices;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapBasics {

	public static void main(String[] args) {

		// no order -- no indexing
		// Stores vales -- Key-- Value <k,v>
		// Key should be unique not duplicate
		// can store n number of null values but only one null key
		// Hashmap is not synchronized , not thread safe

		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "Washington D C");
		capitalMap.put("UK", "London");
		capitalMap.put("Paris", "France");
		capitalMap.put(null, "Berlin");

		System.out.println(capitalMap.get("India"));
		System.out.println(capitalMap.get("UK"));
		System.out.println(capitalMap.get(null));

		Iterator<String> it = capitalMap.keySet().iterator();

		while (it.hasNext()) {
			String key = it.next();
			String value = capitalMap.get(key);
			System.out.println("key = " + key + "value =" + value);

		}

	}
}
