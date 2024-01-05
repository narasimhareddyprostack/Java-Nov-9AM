package arraylistextwo;

import java.util.ArrayList;

public class ArrayListFive {

	public static void main(String[] args) {
		ArrayList<String> enames=new ArrayList<String>();
		enames.add("Rahul Gandhi");
		enames.add("Sonia ");
		enames.add("Priyanka");
			
		enames.add("Modi");
		enames.add("Siddu");
		enames.add("Deekshith");
		
		System.out.println(enames.isEmpty());
		System.out.println(enames.contains("Amith"));
		System.out.println(enames.size());
	}

}
