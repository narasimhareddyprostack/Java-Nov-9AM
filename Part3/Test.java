class Test{
    public static void main(String[] args){
        int id=101;
        int[] ids={101,102,103,104};
        System.out.println(ids[0]);
        System.out.println(ids[1]);
        System.out.println(ids[2]);
        System.out.println(ids[3]);

        ids[0] = 201;
        ids[1] = 202;
        ids[2] = 203;
        ids[3] = 204;
        System.out.println(ids[0]);
        System.out.println(ids[1]);
        System.out.println(ids[2]);
        System.out.println(ids[3]);
        

    }
}