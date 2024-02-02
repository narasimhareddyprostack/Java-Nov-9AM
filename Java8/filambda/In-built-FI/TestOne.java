@FunctionalInterface
interface FunctionI{
    public abstract int apply(int a);
}
class Test implements FunctionI{
    public int apply(int a){
        return a*a;
    }
    public static void main(String[] args){
        FunctionI t1=new Test();
        System.out.println(t1.apply(10));
    }
}