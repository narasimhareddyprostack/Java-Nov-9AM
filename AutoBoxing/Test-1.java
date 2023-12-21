//What is autoboxing  : Primitive to Object type 
class Emp{}
class Test{
    public static void main(String[] args){
        int[] ids={101,102,103};
        Emp e1=new Emp();
        String ename = new String("Rahul");

        int id=101;
        Integer eid = id;

        System.out.println(ids);  //[I@hexadecimal
        System.out.println(e1);   //Emp@hexadecimal
        System.out.println(ename); //Rahul
        System.out.println(id); //101
    
        System.out.println(eid); //101



    }
}