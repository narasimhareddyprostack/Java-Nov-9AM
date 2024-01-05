package arraylistex;

import java.util.ArrayList;

public class ArrayListTwo {

	public static void main(String[] args) {
		
		ArrayList enames=new ArrayList();
		System.out.println(enames.size());
		enames.add(101);
		enames.add("Rahul");
		enames.add(75000.00);
		enames.add(101);
		enames.add(true);
		System.out.println(enames.size());
		
		/*for(Object obj:enames) {
			System.out.println(obj);
		}*/

	}

}
