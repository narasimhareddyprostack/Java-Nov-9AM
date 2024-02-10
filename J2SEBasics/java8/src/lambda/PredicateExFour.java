package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateExFour {

	public static void main(String[] args) {
		ArrayList<String>	enames=new ArrayList<String>();
		enames.add("Rahul");
		enames.add("Sonia");
		enames.add("Priya");
		
		Predicate<List>  p = names->names.isEmpty();
		System.out.println(p.test(enames));
		
		Function<List,Integer> f= user_Names->user_Names.size();
		System.out.println(f.apply(enames));
		
		Consumer<List>  c = users->{for(Object user:users) {
			System.out.println(user);
		} };
		c.accept(enames);
	}

}
