interface TestI{
    public abstract void sum(int a, int b);
}
class TestImpl {

   
    // what is lambda 
    // no method name, no return type, no access mofifier
    //(int a, int b)->{ System.out.println(a+b);};
    public static void main(String[] args){
               TestI t1= (int a, int b)->{ 
                        System.out.println(a+b);
                 };
                t1.sum(10,20);
        
    }
}