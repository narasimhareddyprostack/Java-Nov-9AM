package pack1;
public class Parent{
        public void m1(){
            System.out.println("Pack1 - Parent Class m1 method");
        }
        public void m2(){
            System.out.println("Pack1 - Parent Class m2 method");
        }
        public void m3(){
            System.out.println("Pack1 - Parent Class m3 method");
        }
        public static void main(String[] args){
            Parent p=new Parent();
            p.m1();
            p.m2();
            p.m3();
            
        }
}