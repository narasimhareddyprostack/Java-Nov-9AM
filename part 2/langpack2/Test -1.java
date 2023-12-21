class Emp{}
class Test{}
class TestDemo{
        public static void main(String[] args){
           Emp e1=new Emp();
           Test t1=new Test();
           String s1=new String("Rahul");
           System.out.println(e1);  //Emp@43abc
           System.out.println(e1.toString());  //Emp@43abc
           System.out.println(t1);  //Test@43fa
           System.out.println(t1.toString());  //Test@43fa
           System.out.println(s1);  //Rahul
           System.out.println(s1.toString());  //Rahul
        }
}