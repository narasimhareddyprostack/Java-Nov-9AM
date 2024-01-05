package arraylistextwo;

import java.util.ArrayList;

public class ArrayListOne {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100); //0
		al.add(100); //1
		al.add("Rahul");//2
		al.add(true);
		al.add(45000.00);
		al.add(null);
		System.out.println(al);
		
		System.out.println(al.get(2));
		al.set(2, "Rahul Gandhi");
		System.out.println(al);

	}

}
