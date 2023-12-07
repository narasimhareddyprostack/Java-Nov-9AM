public class Test{
    public static void main(String[] args){
                Account a1=new Account();
                a1.open_Account();
                a1.deposit_Amount(10000);
                int bal=a1.get_Bal();
                System.out.println(bal);

                Account a2=new Account();
                a2.open_Account();
                a2.deposit_Amount(500000);
                System.out.println(a2.get_Bal());

                //withdrawl
                a1.withdrawl(15);
                a2.withdrawl(100000);
                System.out.println(a1.get_Bal());
                System.out.println(a2.get_Bal());

    }
}