package mapEx;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapEx {
		public static void main(String[] args) {
			HashSet ids=new HashSet();
			HashMap emp=new HashMap();
			ids.add(101);
			ids.add(101);
			ids.add(102);
			ids.add(103);
			
			System.out.println(ids);
			System.out.println(emp);
		}
}
