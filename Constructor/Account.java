class Account{
    int acc_Id;
    String acc_Name;
    Account(int id,String name){
        System.out.println("construcotr method exec auto - once");
        this.acc_Id = id;
        this.acc_Name =name;
    }
    public static void main(String[] args){
        Account a1=new Account(101,"Rahul");
        Account a2=new Account(102,"Sonia");
        System.out.println(a1.acc_Id +":"+ a1.acc_Name);
        System.out.println(a2.acc_Id +":"+a2.acc_Name);
    }
}