package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionOne {

	public static void main(String[] args) {
	ArrayList<String>	enames=new ArrayList<String>();
	enames.add("Rahul");
	enames.add("Sonia");
	enames.add("Priya");
	
	Function<List,Integer> rg = names->names.size();
	Function<List,Boolean> rgFunction = names->names.isEmpty();
	
	System.out.println(rg.apply(enames));
	System.out.println(rgFunction.apply(enames));
	

	}

}
