package linkedlistex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListFour {

	public static void main(String[] args) {
		ArrayList<Integer> uids=new ArrayList<Integer>();
		LinkedList<Integer> eids=new LinkedList<Integer>();
		
		eids.add(701);
		eids.add(650);
		eids.add(150);
		eids.add(211);
		
		Collections.sort(eids);
		System.out.println(eids);
		
		eids.addFirst(101);
		eids.addLast(801);
		System.out.println(eids);
		
		
	}

}
