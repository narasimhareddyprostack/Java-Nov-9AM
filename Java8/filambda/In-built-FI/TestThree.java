import java.util.function.Function;
class Test {
    public static void main(String[] args){
        Function<Integer,Integer> t1=a->a*a;
        System.out.println(t1.apply(10));
    }
}