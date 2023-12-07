class Parent1{
        void m1(){
                System.out.println("Parent1 Class M1 method");
        }
}
class Parent2{
        void m1(){
                System.out.println("Parent2 Class M1 method");
        }
}
class Child extends Parent1,Parent2{
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