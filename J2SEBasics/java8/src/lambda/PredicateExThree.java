package lambda;

interface InterTestOne{
	boolean test(String name);
}

public class PredicateExThree {

	public static void main(String[] args) {
		InterTestOne p = name->name.length() > 5;
		System.out.println(p.test("Rahi"));

	}

}
