class Test{
    public static void main(String[] args){
     try{
            throw new ArithmeticException("/ Cant Divide by Zero");
      }
      catch(ArithmeticException ae){
        //ae.printStackTrace();
        System.out.println(10/5);
      }

    }
}