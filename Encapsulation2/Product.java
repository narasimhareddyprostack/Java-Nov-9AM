class Product{
    private int pId;
    private String pName;
    private double pPrice;
    //generate setters and getters
    public int get_PId(){
        return this.pId;
    }
    public String get_PName(){
        return this.pName;
    }
    public double get_PPrice(){
        return this.pPrice;
    }
    public void set_PId(int id){
        this.pId = id;
    }
    public void set_PName(String name){
        this.pName = name;
    }
    public void set_PPrice(double val){
        this.pPrice = val;
    }
}