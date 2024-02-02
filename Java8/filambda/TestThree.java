interface FunctionI{
    public abstract int sum(int a,int b);
}
class Test implements FunctionI{
    public int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        FunctionI t1=new Test();
        System.out.println(t1.sum(10,20));
    }
}