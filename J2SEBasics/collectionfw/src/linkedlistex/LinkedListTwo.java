package linkedlistex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTwo {

	public static void main(String[] args) {
		ArrayList<Integer> uids=new ArrayList<Integer>();
		LinkedList<Integer> eids=new LinkedList<Integer>();
		
		eids.add(701);
		eids.add(650);
		eids.add(150);
		eids.add(211);
		//System.out.println(eids);
		/*
		int i=0;
		while(i<=eids.size()-1) {
			System.out.println(eids.get(i));
			i++;
		}
		*/
		/*
		for(Integer eid:eids) {
			System.out.println(eid);
		}
		*/
		
		Iterator itr=eids.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
