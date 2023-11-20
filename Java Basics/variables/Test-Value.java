class Test{
           int a=100;
    static int b=200;

    public static void main(String[] args){
     Test t1=new Test();
     Test t2=new Test();
     System.out.println(t1.a+t1.b);
     System.out.println(t2.a+t2.b);
     t1.a=300;

     System.out.println(t1.a+t1.b);
     System.out.println(t2.a+t2.b);

     //update static varible
     Test.b=500;
     System.out.println(t1.a+t1.b);//800
     System.out.println(t2.a+t2.b);//600

    }

}