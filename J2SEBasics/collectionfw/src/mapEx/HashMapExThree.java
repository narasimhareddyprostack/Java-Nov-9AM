package mapEx;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapExThree {
		public static void main(String[] args) {
		
			HashMap<String, String> emp=new HashMap<String, String>();
			emp.put("id", "101");
			emp.put("name", "Rahul");
			emp.put("sal", "45000");
			emp.put("email", "rahul@gamil.com");
			emp.put("loc", "Wayanad");
			System.out.println(emp);
			
			//print all emp properties
			//print all emp keys
			//print all emp values
			
			Collection<String> values = emp.values();
			Set<String> keys=emp.keySet();
			
			System.out.println(values);
			System.out.println(keys);
			
			for(String value:values) {
				System.out.println(value);
			}
		}
}
