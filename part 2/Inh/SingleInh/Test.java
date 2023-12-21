class Parent{
        void m1(){
                System.out.println("Parent Class M1 method");
        }
}
class Child extends Parent{
        void m2(){
                System.out.println("Child Class  M2 method");
        }
}
class Test{
    public static void main(String[] args){
       Child c1=new Child();
       c1.m1();
       c1.m2();

    }
}