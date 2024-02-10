package lambda;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface FunctionI{
	public  int apply(List enames);
}

public class FunctionTwo{

	public static void main(String[] args) {
	
			ArrayList<String>	enames=new ArrayList<String>();
			enames.add("Rahul");
			enames.add("Sonia");
			enames.add("Priya");
			
			FunctionI	obj=names->names.size();
			System.out.println(obj.apply(enames));//3
	}
}
