package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapIterate {

	public static void main(String[] args) {
		//no order-no indexing
		//stores values-pair of key value<k,v>
		//key cannot be duplicate
		//can store n number of null values but only one null key
		//hashmap is not thread ssafe or unsynchronized
		
		HashMap<String,String> capitalMap = new HashMap<String,String>();
		capitalMap.put("India", "New delhi");
		capitalMap.put("USA", "Washington DC");
		capitalMap.put("UK", "London");
		capitalMap.put("UK","London1");
		capitalMap.put("Rusia",null);
		capitalMap.put("France", null);
		capitalMap.put(null,"Berlin");
		capitalMap.put(null, "LA");
		
		System.out.println(capitalMap.get("USA"));
		System.out.println(capitalMap.get("LA"));
		
		System.out.println(capitalMap.get(null));
		
		//iterator:
		Iterator <String> it=capitalMap.keySet().iterator();
		while(it.hasNext()){
			String key=it.next();
			String value=capitalMap.get(key);
			System.out.println("key= "+ key + " value= "+value);
		}
		
		//iterator: over the pair: by using entryset
		System.out.println("----- iterator: over the pair: by using entryset -----");
		Iterator<Entry<String,String>> it1=capitalMap.entrySet().iterator();
		while(it1.hasNext()) {
			Entry<String,String> entry=it1.next();
			System.out.println("key= "+entry.getKey()+" and value "+entry.getValue());
		}
		
		//iterate hashMap using java8 for each and lambda
		System.out.println("----- iterate hashMap using java8 for each and lambda -----");
		capitalMap.forEach((k,v) -> System.out.println("key= "+k+" and value= "+v));

	}

}
