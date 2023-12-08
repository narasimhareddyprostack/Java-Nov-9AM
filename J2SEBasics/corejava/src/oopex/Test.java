package oopex;

public class Test {

	public static void main(String[] args) {
		SA sa=new SA();
		
		sa.setAcc_Id(101);
		sa.setAcc_Name("Rahul");
		sa.setAcc_Bal(50000.00);
		sa.setMin_Bal(500);
		
		CA ca=new CA();
		ca.setAcc_Id(201);
		ca.setAcc_Name("Priyanka");
		ca.setAcc_Bal(2500000.00);
		ca.setMin_Bal(24000);
		
		//sa.cal_Bal();
		//ca.cal_Bal();
		AccountService.getService(sa);
		AccountService.getService(ca);

	}

}
