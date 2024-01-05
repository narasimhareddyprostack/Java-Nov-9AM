package arraylistextwo;

import java.util.ArrayList;

public class ArrayListSevenAll {

	public static void main(String[] args) {
		ArrayList<String> enames=new ArrayList<String>();
		enames.add("Rahul Gandhi");
		enames.add("Sonia Gandhi");
		enames.add("Priyanka");
			
	
		
		ArrayList<String> new_Enames1=new ArrayList<String>();
		ArrayList<String> new_Enames2=new ArrayList<String>();
		new_Enames1.add("Chetan");
		new_Enames1.add("Sanjay");
		enames.addAll(new_Enames1);
		
		System.out.println(enames);
		
		new_Enames2.add("Rahul Gandhi");
		new_Enames2.add("Sonia Gandhi");
		
		enames.removeAll(new_Enames2);
		System.out.println(enames);
	}

}
