class Test{
    public static void main(String[] args){

        Float sal = 45000.00f;  //Autoboxing 
        //Float sal = Float.valueOf(45000.00f);

        float esal = sal;       //Unboxing
        //float esal  = sal.floatValue();

        System.out.println(sal);
        System.out.println(esal);

    }
}