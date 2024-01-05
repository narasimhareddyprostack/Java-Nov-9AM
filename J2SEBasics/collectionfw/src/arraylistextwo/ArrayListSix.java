package arraylistextwo;

import java.util.ArrayList;

public class ArrayListSix {

	public static void main(String[] args) {
		ArrayList<String> enames=new ArrayList<String>();
		enames.add("Rahul Gandhi");
		enames.add("Sonia ");
		enames.add("Priyanka");
			
		enames.add("Modi");
		enames.add("Siddu");
		enames.add("Deekshith");
		
		enames.remove(0);
		enames.remove("Modi");
		
		System.out.println(enames);
	}

}
