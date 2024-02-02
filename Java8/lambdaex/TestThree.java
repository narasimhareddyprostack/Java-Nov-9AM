interface Calculate{
    public abstract int sum(int a, int b);
}
class Test {
 
  /*   public int sum(int a, int b){
        return a+b;
    } */
    public static void main(String[] args){ 
        Calculate cal = (a,b)->a+b;    
        System.out.println(cal.sum(10,20));
    }
}