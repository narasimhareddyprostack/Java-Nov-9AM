class Test{
    public static void main(String[] args){
       
        int[] ids;          //declaration
        ids=new int[4];     //creation
        ids[0] = 101;       //initilization
        ids[1] = 102;       //initilization
        ids[2] = 103;        //initilization

        System.out.println(ids); //[I@dl;fsaj97
        //print array elements - how to print? using indexing
        System.out.println(ids[0]);//101
        System.out.println(ids[1]);//102
        System.out.println(ids[2]);//103
        ids[3] = 977897;
        System.out.println(ids[3]);//977897
        //System.out.println(ids[30]);//RE ie AIOBSE - ie runtime
    }   
}