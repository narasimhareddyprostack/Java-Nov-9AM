class Account{

           int acc_Bal;
    static int min_Bal=500;
    public void open_Account(){}
    public boolean deposit_Amount(int amount){
        this.acc_Bal = this.acc_Bal + amount;
        return true;
    }
    public int get_Bal(){
        return this.acc_Bal  - this.min_Bal; 
    }
    public void withdrawl(int amount){
        this.acc_Bal = this.acc_Bal - amount;
    }
}