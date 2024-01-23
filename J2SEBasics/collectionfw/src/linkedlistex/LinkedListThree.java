package linkedlistex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListThree {

	public static void main(String[] args) {
		ArrayList<Integer> uids=new ArrayList<Integer>();
		LinkedList<Integer> eids=new LinkedList<Integer>();
		
		eids.add(701);
		eids.add(650);
		eids.add(150);
		eids.add(211);
		
		Collections.sort(eids);
		System.out.println(eids);
		
		
		Collections.sort(eids,Collections.reverseOrder());
		System.out.println(eids);
	}

}
