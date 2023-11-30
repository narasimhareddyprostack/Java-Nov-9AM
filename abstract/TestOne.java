abstract class TestOne{
    void m1(){
      System.out.println("TestOne class m1 method");  
    }
}
class Test{
    public static void main(String[] args){
        TestOne t=new TestOne();
        System.out.println(t);
        t.m1();
    }
}