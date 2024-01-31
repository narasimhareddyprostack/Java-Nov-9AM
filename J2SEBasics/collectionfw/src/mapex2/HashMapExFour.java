package mapex2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapExFour {

	public static void main(String[] args) {
	HashMap<String,String>	emp=new HashMap<String, String>();
	emp.put("id", "101");
	emp.put("id", "102"); //overriding
	emp.putIfAbsent("name", "rahul");
	emp.putIfAbsent("name", "sonia");//
	emp.put("sal", "45000");
	
	System.out.println(emp);
	//print all keys  - keyset()
	Set<String> keys=emp.keySet();
	
	for(String key:keys) {
		System.out.println(key);
	}
	
	//print all values -values()
	
	Collection<String> values=emp.values();
	for(String value:values) {
		System.out.println(value);
	}
	}

}
