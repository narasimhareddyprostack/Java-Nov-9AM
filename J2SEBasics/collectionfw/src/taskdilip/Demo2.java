package taskdilip;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		List<Integer>	 ids=new ArrayList<Integer>();
		ArrayList<String> enames=new ArrayList<String>();
		enames.add("Rahul");
		enames.add("Sonia");
		enames.add("Priyanka");
		enames.add("Chethan");
		
		Iterator  itr=enames.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
