@FunctionalInterface
interface FunctionI{
    public abstract int apply(int a);
}
class Test {
  /*   public int apply(int a){
        return a*a;
    } */

    //a->a*a;
    
    public static void main(String[] args){
        FunctionI t1=a->a*a;
        System.out.println(t1.apply(10));
    }
}