package oopnov11;

public class Test {

	public static void main(String[] args) {
		SA sa=new SA(101,"Rahul","rahul@pm.com",50000);
		CA ca=new CA(2001,"Priyanka","priya@pm.com",2500000);
		sa.setAcc_Min_Bal(499);
		ca.setAcc_Min_Bal(24000);
		
		//System.out.println(sa.cal_Bal());
		//System.out.println(ca.cal_Bal());
		AccountService.getServcie(sa);
		AccountService.getServcie(ca);

	}

}
