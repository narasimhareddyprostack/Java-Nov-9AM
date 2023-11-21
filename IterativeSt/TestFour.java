class Test{
   
    public static void main(String[] args){
     String[] enames; //array declaration
            enames = new String[5];
            enames[0]="Rahul";
            enames[1]="Sonia";
            enames[2]="Priyanka";
            enames[3]="Modi";
            enames[4]="Shaw";

       System.out.println(enames.length);     
     for(int i=0;i<=enames.length-1;i++){
        System.out.println(enames[i]);
     }
    }
}