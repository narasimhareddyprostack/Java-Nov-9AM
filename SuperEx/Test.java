class Parent{
		Parent(int b){
		}
}
class Child extends Parent{
	 Child(int a,int b){
		super(b);
	 }
}
public class Test{

	public static void main(String[] args){
			new Child(10,20);
	}
}