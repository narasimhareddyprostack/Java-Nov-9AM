package linkedHSEx;

import java.util.HashSet;

public class HashSetExThree {

	public static void main(String[] args) {
		 HashSet set1=new HashSet();
		 HashSet set2=new HashSet();
		 set1.add(10);
		 set1.add(20);
		 set1.add(30);
		 set1.add(40);
		 
		 set2.add(30);
		 set2.add(40);
		 set2.add(50);
		 set2.add(60);
		 
		 //common elments
		 //set1.retainAll(set2);
		 //System.out.println(set1);
		 
		 //set1.removeAll(set2);
		 //System.out.println(set1);
		 
		 
		 System.out.println(set1.containsAll(set2));
		 
		 System.out.println(set1);
		 
	}

}
