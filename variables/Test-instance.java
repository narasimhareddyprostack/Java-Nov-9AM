class Test{
    
    int eid=101; //non-static means instance

    public static void main(String[] args){
      //How to read / access instance variable
      //we can access using object
      Test t1=new Test();
      Test t2=new Test();
      Test t3=new Test();
      System.out.println(t1.eid);
      System.out.println(t2.eid);
      t1.eid = 102;
      System.out.println(t3.eid);
      //after updating t1 object
      System.out.println(t1.eid);
    }

}