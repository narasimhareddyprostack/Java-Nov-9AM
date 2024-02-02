interface Calculate{
    public abstract int sum(int a, int b);
}
class Test implements Calculate{
 
    public int sum(int a, int b){
        return a+b;
    }
 
 
 
 
 
 
    public static void main(String[] args){
        Test t = new Test();
        System.out.println(t.sum(10,20));
    }
}