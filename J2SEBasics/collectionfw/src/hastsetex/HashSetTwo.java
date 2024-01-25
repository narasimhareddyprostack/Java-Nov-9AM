package hastsetex;

import java.util.Collections;
import java.util.HashSet;

public class HashSetTwo {

	public static void main(String[] args) {
		HashSet hs1=new HashSet();
		HashSet<Integer> ids=new HashSet<Integer>(100);
		HashSet<String> enames=new HashSet<String>(1000,(float)0.8);
		
		ids.add(107);
		ids.add(780);
		ids.add(201);
		ids.add(54);
		System.out.println(ids);
		
		//Collections.sort();
		System.out.println(ids);
	}

}
