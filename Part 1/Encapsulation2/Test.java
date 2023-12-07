class Test{
    public static void main(String[] args){
         Product p1=new Product();
         p1.set_PId(101);
         p1.set_PName("Iphone 12s");
         p1.set_PPrice(45000);

         System.out.println(p1.get_PId());
         System.out.println(p1.get_PName());
         System.out.println(p1.get_PPrice());
    }
}