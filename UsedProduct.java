public class UsedProduct extends Product{
    private String manufactureDate;
    
    UsedProduct(){

    }

    UsedProduct(String name, double price, String manufactureDate){
        super(name, price);
        this.manufactureDate=manufactureDate;
    }
    public String getManufactureDate(){
        return this.manufactureDate;
    }
    public void setManufactureDate(String manufactureDate){
        this.manufactureDate=manufactureDate;
    }
    @Override
    public String priceTag(){
        return getName()+"(used) $"+this.getPrice()+"(Manufacture Date: "+this.getManufactureDate()+")";       
    }


    
}
