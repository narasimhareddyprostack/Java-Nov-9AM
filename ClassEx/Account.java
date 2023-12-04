package pack1;
public class Account{
        void open_Account(){
            System.out.println("Account Opened Successfully");
        }
        boolean deposit_Amount(int amount){
            System.out.println("Deposit Amount Successfully");
            return true;
        }
        int  get_Bal(){
            System.out.println("getting Bal - Successfully");
            return 0;
        }
        void get_St(){
             System.out.println("server Busy! Successfully");
        }
        void withdrawl(){
             System.out.println("Low Balance");
        }
        void close_Account(){
             System.out.println("Account Closed Successfully");
        }
}