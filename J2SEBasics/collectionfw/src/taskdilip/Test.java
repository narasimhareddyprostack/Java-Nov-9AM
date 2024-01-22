package taskdilip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
	List<Integer>	 ids=new ArrayList<Integer>();
	ArrayList<String> enames=new ArrayList<String>();
	System.out.println(ids);
	System.out.println(enames);
	
	enames.add("Rahul");
	enames.add("Sonia");
	enames.add("Priyanka");
	enames.add("Chethan");
	System.out.println(enames);
	//sort employees
	//Natural Sorting order - using Collections (class)
	Collections.sort(enames);
	System.out.println(enames);
	
	
		for(String ename:enames) {
				System.out.println(ename);
		}
	
		
	}

}
