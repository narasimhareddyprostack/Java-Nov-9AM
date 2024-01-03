class Parent{

}
class Child extends Parent{

}
class Emp{

}
class Test{
    public static void main(String[] args){
        String s1=new String("Rahul");
        String s2=new String("Rahul");
        String s3="Rahul";
        String s4="Rahul";

        Emp e1=new Emp();
        Emp e2=new Emp();
        
           int a=100;
           int b=200;
           int c=100;
        
        System.out.println(e1.equals(e2));
        System.out.println(e1 == e2);
        System.out.println(a==c);


    }
}