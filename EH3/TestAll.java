class Test{
    public static void main(String[] args){
        
        try{
            String ename = null;
            //System.out.println(ename.length());//NPE
            //System.out.println(10/0);   //AE
            int[] ids={101,102,103}; 
            System.out.println(ids[4]);  //AIOBE

        }
        catch(NullPointerException ae){
           ae.printStackTrace();
        }
        catch(ArithmeticException ae){
             ae.printStackTrace();
        }
        catch(Exception ae){
           ae.printStackTrace();
        }
       
       
       
    }
}