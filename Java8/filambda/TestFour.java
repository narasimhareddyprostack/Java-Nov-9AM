interface FunctionI{
    public abstract int sum(int a,int b);
}
class  Test{
     public static void main(String[] args){
        FunctionI t1=(a,b)->a+b;
        System.out.println(t1.sum(10,20));
    }
}