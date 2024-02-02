interface TestI{
    public abstract void sum(int a, int b);
}
class TestImpl implements TestI{
    public void sum(int a, int b){
        System.out.println(a+b);
    }
    public static void main(String[] args){
        TestImpl t1=new TestImpl();
        t1.sum(10,20);
    }
}