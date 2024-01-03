class Test{
    public static void main(String[] args){

        System.out.println(10/5);       //2
        try{
            System.out.println(10/0);  //2.5
        }
        catch(Exception e){
            //System.out.println(e.toString);
            e.printStackTrace();
        }
        System.out.println(10/2);     //5   
    }
}