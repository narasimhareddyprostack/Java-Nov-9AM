abstract class TestTwo{
    void m1(){}  // non-abstract/concrete methhod
   // +
    abstract void m2();   //no impl
}

class Test{
     public static void main(String[] args){
        TestTwo t=new TestTwo();
        System.out.println(t);
        t.m1();
    }
}