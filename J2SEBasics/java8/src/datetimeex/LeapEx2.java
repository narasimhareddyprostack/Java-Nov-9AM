package datetimeex;

import java.time.Year;

public class LeapEx2 {

	public static void main(String[] args) {
		Year year = Year.now();
		System.out.println(year);
		if(year.isLeap()) {
			System.out.println("Yes Leap Year");
		}
		else {
			System.out.println("Not a Leap Year");
			
		}

	}

}
