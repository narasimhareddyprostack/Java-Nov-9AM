package mapex2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExEntrys {

	public static void main(String[] args) {
		HashMap<String,String>	emp=new HashMap<String, String>();
		emp.put("id", "101");
		emp.put("id", "102"); //overriding
		emp.putIfAbsent("name", "rahul");
		
		emp.put("sal", "45000");
		
		
		
		Set<String> keys=emp.keySet();
		
		Collection<String> values= emp.values();
		
		Set<Entry<String,String>> entries=  emp.entrySet();
		
		
		
		
		System.out.println(keys);
		System.out.println(values);
		System.out.println(entries);
	}

}
