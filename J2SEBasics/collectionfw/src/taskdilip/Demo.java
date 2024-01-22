package taskdilip;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Integer>	 ids=new ArrayList<Integer>();
		ArrayList<String> enames=new ArrayList<String>();
		enames.add("Rahul");
		enames.add("Sonia");
		enames.add("Priyanka");
		enames.add("Chethan");
		
		int i=0;
		while(i<=enames.size()-1){
			System.out.println(enames.get(i));
			i++;
		}

	}

}
