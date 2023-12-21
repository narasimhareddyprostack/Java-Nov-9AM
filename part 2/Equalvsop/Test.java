class Emp{
   public String toString(){
    return "Emloyee Class";
   }
}
class Test{
    public static void main(String[] args){
        Emp e1=new Emp();
        String s1=new String("Rahul");
        System.out.println(e1);//Emp@abc123
        System.out.println(e1.toString());//Emp@abc123
        System.out.println(s1.toString());
    }
}