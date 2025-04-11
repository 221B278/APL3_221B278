class Roabza extends Decorator{
    Roabza(Offering offering){
        this.offering=offering;
    }
    
    int getPrice(){
        return offering.getPrice() + 35;
    }
    
    String getName(){
        return offering.getName() + " with Roabza ";
    }
}