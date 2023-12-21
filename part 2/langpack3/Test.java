class Emp{

}
class Test{

}
class TestDemo{
    public static void main(String[] args){
       Emp  e1=new Emp();
       Test t1=new Test();
       Test t2=new Test();
       String s1=new String("Rahul");
       int  a=100;
       int  b=200;
       int  c=100;
       //System.out.println(a.equals(b));
       //System.out.println(a==b); //content comparision
       System.out.println(t1 == t2);//false
       System.out.println(t1.equals(t2));//false
    }
}