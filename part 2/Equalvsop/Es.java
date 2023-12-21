class Test{
    public static void main(String[] args){
        
        String fName="Pro";
        String lName="Pro";
        String mName=new String("Pro");


        System.out.println(fName.equals(lName));

        System.out.println(fName == lName);
        System.out.println(fName == mName);
    }
}