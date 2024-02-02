@FunctionalInterface
interface DaoI{
    public abstract void m1();
}
class Test{
    public static void main(String[] args){

       /*  ()->{
             System.out.println("m1 method");
            }; */
        
        
        
        DaoI  obj = ()->{System.out.println("m1 method");};
        obj.m1();
    }

}