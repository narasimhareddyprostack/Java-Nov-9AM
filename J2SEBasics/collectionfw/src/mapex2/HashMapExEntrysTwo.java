package mapex2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExEntrysTwo {

	public static void main(String[] args) {
		HashMap<String,String>	emp=new HashMap<String, String>();
		emp.put("id", "101");
		emp.put("id", "102"); //overriding
		emp.putIfAbsent("name", "rahul");
		
		emp.put("sal", "45000");
		
		
		Set<Entry<String,String>> entries=  emp.entrySet();
		
		System.out.println(entries);
		Iterator itr=entries.iterator();
		while(itr.hasNext()) {
			Map.Entry<String, String> entry=(Entry) itr.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
	}

}
