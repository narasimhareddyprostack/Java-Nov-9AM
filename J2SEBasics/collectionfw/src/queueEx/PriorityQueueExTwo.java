package queueEx;

import java.util.PriorityQueue;

public class PriorityQueueExTwo {

	public static void main(String[] args) {
		PriorityQueue pq1=new PriorityQueue();
		PriorityQueue pq2=new PriorityQueue();
		
		pq1.add("A");
		pq1.add("B");
		pq1.add("C");
		pq1.add("D");
		System.out.println(pq1);
		System.out.println(pq2);
		
		System.out.println(pq2.poll());
		System.out.println(pq2);
		
	}

}
