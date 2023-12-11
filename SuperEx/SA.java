class SA extends Account{
    int acc_Id;
    double acc_Amount;
    SA(int id,String name,String email,String loc,double amount){
        super(name,email,loc);
        this.acc_Id =id;
        this.acc_Amount = amount;
    }
}