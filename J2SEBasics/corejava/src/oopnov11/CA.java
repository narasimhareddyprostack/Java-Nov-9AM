package oopnov11;

public class CA extends Account {
	private int acc_Id;
	private int acc_Amount;
	private int acc_Min_Bal;
	
	public int getAcc_Min_Bal() {
		return acc_Min_Bal;
	}
	public void setAcc_Min_Bal(int acc_Min_Bal) {
		this.acc_Min_Bal = acc_Min_Bal;
	}
	public CA(int id,String name,String email,int amount) {
		super(name,email);
		this.acc_Id=id;
		this.acc_Amount=amount;
	}
	public int cal_Bal() {
		int bal = this.acc_Amount - this.getAcc_Min_Bal();
		return bal;
	}
}
