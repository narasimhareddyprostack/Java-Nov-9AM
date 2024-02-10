package lambda;

interface InterTest{
	boolean test(String name);
}
public class PredicateExTwo implements InterTest {
	public boolean test(String name){
		return name.length() > 5;
	}
	public static void main(String[] args) {
		
		 InterTest p=new PredicateExTwo();
		 System.out.println(p.test("Rahul Gandhi"));
	}

}
