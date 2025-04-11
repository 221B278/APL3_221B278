class Rum extends Decorator{
    Rum(Offering offering){
        this.offering=offering;
    }
    
    int getPrice(){
        return offering.getPrice() + 55;
    }
    
    String getName(){
        return offering.getName() + " with Rum ";
    }
}