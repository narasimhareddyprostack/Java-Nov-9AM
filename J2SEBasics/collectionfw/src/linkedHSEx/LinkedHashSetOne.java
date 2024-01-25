package linkedHSEx;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetOne {

	public static void main(String[] args) {
		HashSet hs=new HashSet(100,0.9f);
		LinkedHashSet lhs=new LinkedHashSet(50,(float)0.6);
		
		hs.add(100);
		hs.add(100);
		hs.add("Rahul");
		hs.add(true);
		hs.add(null);
		
		lhs.add(101);
		lhs.add(101);
		lhs.add("Rahul");
		lhs.add(true);
		lhs.add(null);
		System.out.println(hs);
		System.out.println(lhs);

	}

}
