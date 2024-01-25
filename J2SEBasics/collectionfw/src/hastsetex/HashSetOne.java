package hastsetex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetOne {

	public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(10);
	al.add(10);
	al.add("Rahul Gandhi");
	al.add(true);
	al.add(null);
	
	System.out.println(al);
	
	HashSet	hs=new HashSet();
	hs.add(10);
	hs.add(10);
	hs.add("Rahul Gandhi");
	hs.add(true);
	hs.add(null);
	System.out.println(hs);
	
		/*for(Object ele:hs){
			System.out.println(ele);
		}
		*/
		Iterator itr=hs.iterator();
		while(itr.hasNext()) {
				System.out.println(itr.next());
		}
	}

}
