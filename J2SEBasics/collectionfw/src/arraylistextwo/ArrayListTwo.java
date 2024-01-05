package arraylistextwo;

import java.util.ArrayList;

public class ArrayListTwo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		ArrayList<Integer> ids=new ArrayList<Integer>();
		ArrayList<String> enames=new ArrayList<String>();
		
		al.add(100);
		al.add("Rahul");
		
		ids.add(101);
		ids.add(102);
		//ids.add("Rahul");
		enames.add("RG");
		enames.add("SG");
		enames.add("PG");
		enames.add(null);
		enames.add(null);
		System.out.println(al);
		System.out.println(ids);
		System.out.println(enames);

	}

}
