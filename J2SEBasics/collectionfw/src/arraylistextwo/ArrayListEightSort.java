package arraylistextwo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEightSort {

	public static void main(String[] args) {
		ArrayList<String> enames=new ArrayList<String>();
		enames.add("Rahul Gandhi");
		enames.add("Sonia ");
		enames.add("Priyanka");
			
		enames.add("Modi");
		enames.add("Siddu");
		enames.add("Deekshith");
		
		System.out.println(enames);
		
		Collections.sort(enames);
		
		System.out.println(enames);
		
		Collections.shuffle(enames);
		System.out.println(enames);
	}

}
