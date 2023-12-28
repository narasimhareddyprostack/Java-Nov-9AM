public class Test{

    public static void main(String[] args){
           System.out.println("Good Morning");
           try{
            throw new TestException("Good AfterNoon");
           }
           catch(Exception e){
                System.out.println(e.getMessage());
                //e.printStackTrace();
            }
          

    }

}