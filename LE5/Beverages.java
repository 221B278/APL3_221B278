abstract class Beverages{
    private void pour(int qty){
        System.out.println(" add "+ qty + "ml of  Beverages");
    }
    protected abstract void addCont();
    protected void stir(){}
    private void serve(){
    System.out.println("served by the waiter");
    }
    public final void templateMeth(int qty ){
        pour(qty);
        addCont();
        stir();
        serve();
    }
}