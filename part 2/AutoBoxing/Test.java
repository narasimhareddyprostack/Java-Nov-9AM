//What is autoboxing  : Primitive to Object type 
class Emp{}
class Test{
    public static void main(String[] args){
       
        int a=100;
        Integer b = Integer.valueOf(a); 
        Integer c = 100;  //Autoboxing 
        int d = b;        //Unboxing
        int e = b.intValue();

        
        System.out.println(d);
        System.out.println(e);
      



    }
}