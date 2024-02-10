package defaultEx;

public class Test implements Dao {
	@Override
	public void login() {

	}
	@Override
	public void logout() {

	}
	public static void main(String[] args) {
		Dao t=new Test();
		t.forget_Password();
	}

}
