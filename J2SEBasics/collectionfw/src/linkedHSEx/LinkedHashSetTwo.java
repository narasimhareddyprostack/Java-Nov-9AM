package linkedHSEx;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTwo {

	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		
		lhs.add(900);
		lhs.add(2000);
		lhs.add(1300);
		lhs.add(50);
		lhs.add(65);
		lhs.add(6001);
		System.out.println(lhs);
		
		for(Object ele:lhs) {
			System.out.println(ele);
		}
		Iterator itr=lhs.iterator();
		while(itr.hasNext()) {
				System.out.println(itr.next());
		}
		
		for(int i=0;i<=lhs.size()-1; i+++) {
				System.out.println(lhs.);
		}
		
	}

}
