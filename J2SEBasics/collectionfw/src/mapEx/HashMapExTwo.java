package mapEx;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapExTwo {
		public static void main(String[] args) {
			HashSet<Integer> ids=new HashSet<Integer>();
			System.out.println(ids);
			ids.add(101);
			HashMap<String, String> emp=new HashMap<String, String>();
			emp.put("id", "101");
			emp.put("name", "Rahul");
			emp.put("sal", "45000");
			emp.put("email", "rahul@gamil.com");
			emp.put("loc", "Wayanad");
			System.out.println(emp);
		}
}
