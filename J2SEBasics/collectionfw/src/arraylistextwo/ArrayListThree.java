package arraylistextwo;

import java.util.ArrayList;

public class ArrayListThree {

	public static void main(String[] args) {
		ArrayList<String> enames=new ArrayList<String>();
		enames.add("Rahul Gandhi");
		enames.add("Sonia ");
		enames.add("Priyanka");
			
		enames.add("Modi");
		enames.add("Siddu");
		enames.add("Deekshith");
		
		System.out.println(enames);
		
		for(int i=0; i<=enames.size()-1;i++) {
			System.out.println(enames.get(i));
		}
	}

}
