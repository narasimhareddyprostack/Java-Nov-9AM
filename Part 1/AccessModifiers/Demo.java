package pack1;
class Demo{
        public static void main(String[] args){

                User obj1=new User();
                obj1.m1();//m1 is public
                obj1.m2();//m2 is default
                //obj1.m3();//m3 is private
                obj1.m4(); //m4 is protected

        }
}