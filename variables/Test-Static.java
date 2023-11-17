class Test{
    
    static String org_Name  = "TCS";

    public static void main(String[] args){
      //How to read / access static variable
      //using class Name,object, directly in statatic context
      Test t1=new Test();
      System.out.println(Test.org_Name); 
      System.out.println(t1.org_Name); 
      System.out.println(org_Name); 
    }

}