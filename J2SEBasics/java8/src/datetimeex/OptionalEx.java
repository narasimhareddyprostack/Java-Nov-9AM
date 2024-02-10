package datetimeex;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		String ename = null;
		Optional value=Optional.ofNullable(ename);
		if(value.isPresent()) {
			String name = (String) value.get();
			System.out.println(name.length());
		}
		else {
			System.out.println("Value is Null");
		}
		
	}

}
;