public class ImportedProduct extends Product{
    private double customsFee;

    ImportedProduct(){

    }
    ImportedProduct(String name, double price, double customsFee){
        super(name, price);
        this.customsFee=customsFee;
    }

    public double getCustomsFee(){
        return this.customsFee;
    }
    public void setCustomsFee(double customsFee){
        this.customsFee=customsFee;
    }
    public double totalPrice(){
        double total;
        total = getPrice()+this.customsFee;
        return total;
    }
    @Override
    public String priceTag(){
        return getName()+" $ "+this.totalPrice()+ "(Customs fee:$"+this.getCustomsFee()+")";       
    }    
}
