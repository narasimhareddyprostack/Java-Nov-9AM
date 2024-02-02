@FunctionalInterface
interface DaoI{
     public abstract void m1();
     //public abstract void m2();
}
class Dao implements DaoI{
         public void m1(){
          System.out.println("m1 method - impl class");
         }
         public static void main(String[] args){
          Dao obj=new Dao();
          obj.m1();
         }
}

//Single Abstract Method  - 