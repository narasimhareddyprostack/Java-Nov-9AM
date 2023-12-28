public class Account{
    public static void withdrawl(int amount)   {
            int acc_Bal = 1250;
           
            if(acc_Bal < 500){
                try{
                throw new 
                ("Low Bal!Open Laptop and pracice");
                }
                catch(InsuffientBalException balException){
                    //balException.printStackTrace();
                    System.out.println(balException.getMessage());
                    
                }
                
            }
            else{
                System.out.println("Enjoy!");
            }

    }
    public static void main(String[] args)  {
        withdrawl(500);
    }
}