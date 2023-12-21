class Parent{ }
class Child extends Parent {}
class Emp{}
class Demo{
    public static void main(String[] args){
        
        String  s1=new String("Rahul");
        String  s2=new String("Rahul");
        StringBuffer  s3=new StringBuffer("Rahul");

        String  s4="Rahul";
        String  s5="Rahul";
        
        
        Parent p1=new Parent();
        Child  c1=new Child();
        Emp  e1=new Emp();
        Emp  e2=new Emp();
        int a=100;
        int b=200;
        int c=100;

        System.out.println(s4==s5);
        System.out.println(s4.equals(s5));

        /* System.out.println(s1==s2);         //false
        System.out.println(s1.equals(s2));  //true
 */


        //System.out.println(p1==c1);
        //System.out.println(p1.equals(c1));
        //System.out.println(e1==e2);//false
        //System.out.println(e1.equals(e2));//falses
        //System.out.println();
    }
}