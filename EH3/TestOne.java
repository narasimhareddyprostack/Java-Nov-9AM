class Test{
    public static void main(String[] args){
        System.out.println(10/5);
        try{
         System.out.println(10/0);
        }
        catch(Exception ae){
            System.out.println(10/1);
        }
        catch(NullPointerException ae){
            System.out.println(10/1);
        }
        catch(ArithmeticException ae){
            System.out.println(10/1);
        }
       
        System.out.println(10/2);
    }
}