package lambda;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface FunctionIn{
	public  int apply(List enames);
}
public class FunctionThree implements FunctionIn{
	
	public int apply(List enames) {
		
		return enames.size();
	}
	public static void main(String[] args) {
			ArrayList<String>	enames=new ArrayList<String>();
			enames.add("Rahul");
			enames.add("Sonia");
			enames.add("Priya");
			
			FunctionIn	obj=new FunctionThree();
			System.out.println(obj.apply(enames));//3
	}
}
